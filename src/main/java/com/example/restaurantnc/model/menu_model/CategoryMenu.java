package com.example.restaurantnc.model.menu_model;

import java.util.ArrayList;
import java.util.List;

/***
 * категория для меню
 */
public class CategoryMenu {

    private String nameCategory;

    private List<AbstractMenu> abstractMenuList;

    public CategoryMenu(String nameCategory) {
        this.nameCategory = nameCategory;
        abstractMenuList = new ArrayList<>();
    }

    public CategoryMenu() {
        abstractMenuList = new ArrayList<>();
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<AbstractMenu> getAbstractMenuList() {
        return abstractMenuList;
    }

    public void setAbstractMenuList(List<AbstractMenu> abstractMenuList) {
        this.abstractMenuList = abstractMenuList;
    }

    public void addItemMenuToCategory(AbstractMenu abstractMenu){
        abstractMenuList.add(abstractMenu);
    }

    @Override
    public String toString() {
        return "CategoryMenu{" +
                "nameCategory='" + nameCategory + '\'' +
                ", abstractMenuList=" + abstractMenuList +
                '}';
    }
}
