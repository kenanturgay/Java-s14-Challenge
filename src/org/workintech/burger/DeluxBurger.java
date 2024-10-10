package org.workintech.burger;

public class DeluxBurger extends Hamburger {


    public DeluxBurger() {
        super("Delux Burger", "Beef", 19.10, "White Roll");
        addHamburgerAddition1("Chips", 2.75);
        addHamburgerAddition2("Drink",3.75);

    }



    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Ek malzeme eklenemez. Deluxe Burger zaten sabit içerikli.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Ek malzeme eklenemez. Deluxe Burger zaten sabit içerikli.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Ek malzeme eklenemez. Deluxe Burger zaten sabit içerikli.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Ek malzeme eklenemez. Deluxe Burger zaten sabit içerikli.");
    }
}
