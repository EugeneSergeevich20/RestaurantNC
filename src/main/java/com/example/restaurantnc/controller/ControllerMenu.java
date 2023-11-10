package com.example.restaurantnc.controller;

import com.example.restaurantnc.service.menu_service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * контроллер для меню
 */
@RestController
public class ControllerMenu {

    @Autowired
    private final MenuService menuService;

    public ControllerMenu(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/getMenu")
    public String getMenu(){

        menuService.getCategory();
        menuService.getDish();
        menuService.getDring();
        return "complited";
    }
}
