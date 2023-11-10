package com.example.restaurantnc.model.menu_model;

/**
 * Класс реализующий модель Напитка
 */
public class Drink extends AbstractMenu{

    public String nameDrink; // наименование напитка
    public String structureDrink; // состав напитка
    public double volume; // объём напитка

    public Drink(String nameDrink, String structureDrink, double volume) {
        this.nameDrink = nameDrink;
        this.structureDrink = structureDrink;
        this.volume = volume;
    }

    public Drink() {
    }

    public String getNameDrink() {
        return nameDrink;
    }

    public void setNameDrink(String nameDrink) {
        this.nameDrink = nameDrink;
    }

    public String getStructureDrink() {
        return structureDrink;
    }

    public void setStructureDrink(String structureDrink) {
        this.structureDrink = structureDrink;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void addCategoryToMenu(CategoryMenu category) {
        super.addCategoryToMenu(category);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "nameDrink='" + nameDrink + '\'' +
                ", structureDrink='" + structureDrink + '\'' +
                ", volume=" + volume +
                '}';
    }
}
