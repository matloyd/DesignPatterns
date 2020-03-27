package com.matloyd.structurals.composite;


public class Menu extends MenuComponent {
    public Menu(String url, String name) {
        super(url, name);
    }


    @Override
    protected MenuComponent add(MenuComponent menuComponent) {
        childes.add(menuComponent);
        return this;
    }

    @Override
    protected MenuComponent remove(MenuComponent menuComponent) {
        childes.remove(menuComponent);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("::menu::");
        stringBuilder.append(print());
        childes.forEach(leaf -> stringBuilder.append(leaf.toString()));
        return stringBuilder.toString();
    }
}
