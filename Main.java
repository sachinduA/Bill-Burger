package com.company;

public class Main {

    public static void main(String[] args) {
	HamBurger hamburger = new HamBurger("Basic", "Sausage", 3.56, "white");
//    double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Price is " + hamburger.itemizeHamburger());

        DeluxBurger db = new DeluxBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();
    }
}
