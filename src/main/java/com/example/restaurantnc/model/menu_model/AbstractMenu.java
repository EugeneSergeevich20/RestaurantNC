package com.example.restaurantnc.model.menu_model;

import java.util.ArrayList;
import java.util.List;

/**
 * Абстрактный класс для меню (блюдо, напитки)
 */
public class AbstractMenu {

    private List<CategoryMenu> categoryMenuList = new ArrayList<>(); // категория меню

    public void addCategoryToMenu(CategoryMenu category){
        categoryMenuList.add(category);
    }

    public List<CategoryMenu> getCategoryMenuList() {
        return categoryMenuList;
    }

    public void setCategoryMenuList(List<CategoryMenu> categoryMenuList) {
        this.categoryMenuList = categoryMenuList;
    }

    @Override
    public String toString() {
        return "AbstractMenu{" +
                "categoryMenuList=" + categoryMenuList +
                '}';
    }
}
