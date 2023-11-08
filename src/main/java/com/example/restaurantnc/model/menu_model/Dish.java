package com.example.restaurantnc.model.menu_model;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс реализующий модель Блюдо
 */
public class Dish extends AbstractMenu {

    private String nameDish; //наименование блюда
    private String structureDish; // состав блюда
    private double weightDish; // вес блюда
    private double caloriesDish; // калорийность блюда
    private double priceDish; // стоимость блюда
    //private List<CategoryMenu> categoryMenuList;

    public Dish(String nameDish, String structureDish, double weightDish, double caloriesDish, double priceDish) {
        this.nameDish = nameDish;
        this.structureDish = structureDish;
        this.weightDish = weightDish;
        this.caloriesDish = caloriesDish;
        this.priceDish = priceDish;
        //categoryMenuList = new ArrayList<>();
    }

    public Dish() {
        //categoryMenuList = new ArrayList<>();
    }

    //TODO: тоже под вопросом - нужно тестить
    @Override
    public void addCategoryToMenu(CategoryMenu category) {
        super.addCategoryToMenu(category);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "nameDish='" + nameDish + '\'' +
                ", structureDish='" + structureDish + '\'' +
                ", weightDish=" + weightDish +
                ", caloriesDish=" + caloriesDish +
                ", priceDish=" + priceDish +
                /*", category=" + super.getCategoryMenuList() +*/
                '}';
    }
}
