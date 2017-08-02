package com.gregdferrell.designpatterns.composite;

/**
 * Created by Greg on 8/1/2017.
 */
public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(print(this));

        for (MenuComponent menuComponent : menuComponentList) {
            sb.append(menuComponent.toString());
        }
        return sb.toString();
    }
}
