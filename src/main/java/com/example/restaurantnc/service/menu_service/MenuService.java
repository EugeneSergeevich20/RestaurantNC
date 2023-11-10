package com.example.restaurantnc.service.menu_service;

import com.example.restaurantnc.model.menu_model.CategoryMenu;
import com.example.restaurantnc.model.menu_model.Dish;
import com.example.restaurantnc.model.menu_model.Drink;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Данный класс отвечает за сервис меню(добавление, обновление, удаление, чтение - категории, блюда, напитка и всего меню)
 * Пока что всё будет в ожном классе так как без БД
 * В дальнейшем для каждого будет создан свой класс
 */
@Service
public class MenuService {

    private List<CategoryMenu> categoryMenuList;
    private List<Dish> dishList;
    private List<Drink> drinkList;

    public MenuService() {
        //создание коллекций
        categoryMenuList = new ArrayList<>();
        dishList = new ArrayList<>();
        drinkList = new ArrayList<>();

        //добавление данных
        CategoryMenu lunc = new CategoryMenu("Обед");
        CategoryMenu breakfast = new CategoryMenu("Завтрак");
        CategoryMenu dinner = new CategoryMenu("Ужин");

        Dish dish1 = new Dish("Макароны с сыром", "макароны, сыр", 250.00, 745.00, 299.00);
        Dish dish2 = new Dish("Омлет с зеленью", "яйца, молоко, зелень", 175.00, 540.00, 125.00);
        Dish dish3 = new Dish("Оладья", "мука, яйца, молоко, сгущёнка", 300.00, 655.00, 150.00);
        Dish dish4 = new Dish("Мясо по-французки", "картошка, свинина, сыр, помидоры, лук", 380.00, 700.00, 455.00);
        Dish dish5 = new Dish("Щи", "картошка, курица, лук, морковь ...", 400.00, 500.00, 355.00);
        Dish dish6 = new Dish("Пицца", "мука, папперони, сур, томатный соус", 700.00, 1245.00, 500.00);

        Drink drink1 = new Drink("Американо", "Кофе зерновой", 0.4);
        Drink drink2 = new Drink("Чай с бергамотом", "Чай лиственный, бергамот", 0.25);
        Drink drink3 = new Drink("Кока-кола", "Кока-кола", 0.5);

        //добаление блюд->категори , категории->блюдо
        lunc.addItemMenuToCategory(dish1);
        lunc.addItemMenuToCategory(dish5);
        lunc.addItemMenuToCategory(drink1);
        breakfast.addItemMenuToCategory(dish2);
        breakfast.addItemMenuToCategory(dish3);
        breakfast.addItemMenuToCategory(drink2);
        dinner.addItemMenuToCategory(dish4);
        dinner.addItemMenuToCategory(dish6);
        dinner.addItemMenuToCategory(drink3);

        dish1.addCategoryToMenu(lunc);
        dish2.addCategoryToMenu(breakfast);
        dish3.addCategoryToMenu(breakfast);
        dish4.addCategoryToMenu(dinner);
        dish5.addCategoryToMenu(lunc);
        dish6.addCategoryToMenu(dinner);

        drink1.addCategoryToMenu(lunc);
        drink2.addCategoryToMenu(breakfast);
        drink3.addCategoryToMenu(dinner);
        //добавление в коллекцию
        categoryMenuList.add(lunc);
        categoryMenuList.add(breakfast);
        categoryMenuList.add(dinner);

        dishList.add(dish1);
        dishList.add(dish2);
        dishList.add(dish3);
        dishList.add(dish4);
        dishList.add(dish5);
        dishList.add(dish6);

        drinkList.add(drink1);
        drinkList.add(drink2);
        drinkList.add(drink3);
    }

    public void getCategory(){
        for (CategoryMenu category:
             categoryMenuList) {
            System.out.println(category.toString());
        }
        System.out.println();
    }

    public void getDish(){
        for (Dish dish:
             dishList) {
            System.out.println(dish.toString());
        }
        System.out.println();
    }

    public void getDring(){
        for (Drink drink:
             drinkList) {
            System.out.println(drink.toString());
        }
        System.out.println();
    }

}
