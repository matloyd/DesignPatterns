package com.matloyd.structurals.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public abstract class MenuComponent {
    private final String url;
    private final String name;
    protected List<MenuComponent> childes = new ArrayList<>();


    public MenuComponent(String url, String name) {
        this.url = url;
        this.name = name;
    }

    protected MenuComponent add(MenuComponent menuComponent) {
        throw new IllegalStateException("Not supported here!");
    }

    protected MenuComponent remove(MenuComponent menuComponent) {
        throw new IllegalStateException("Not supported here!");
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    protected String print() {
        return String.format("%s->%s%n", name, url);
    }

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuComponent that = (MenuComponent) o;
        return url.equals(that.url) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, name);
    }
}
