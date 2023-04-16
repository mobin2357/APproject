package org.example.View;

import org.example.View.GameMenus.ShopMenu;

public enum MenuType {
    SHOP_MENU(new ShopMenu());

    public Menu menu;
    MenuType(Menu menu){
        this.menu = menu;
    }
}
