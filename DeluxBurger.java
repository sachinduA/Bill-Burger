package com.company;

public class DeluxBurger extends HamBurger{
    public DeluxBurger() {
        super("Delux", "Sausage & Bacon", 14.54, "White");
        this.addHamburgerAddition1("Chips", 2.75);
        this.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items");
    }
}
