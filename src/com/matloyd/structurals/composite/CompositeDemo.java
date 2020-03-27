package com.matloyd.structurals.composite;


public class CompositeDemo {

    public static void main(String[] args) {
        Menu root = new Menu("/transfer", "Transfer");
        root.add(new MenuItem("/card-to-card", "Card2Card"))
                .add(new MenuItem("/account", "By AccountNumber"));

        Menu subMenu = new Menu("/by-iban", "IBAN");
        subMenu.add(new MenuItem("/paya", "PAYA"))
                .add(new MenuItem("/satna", "SATNA"));

        root.add(subMenu);

        System.out.println(root.toString());
    }
}
