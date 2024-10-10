package org.workintech.burger;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger(String name, String meat, double price) {
        this.name = name;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public void itemizeHamburger() {
        boolean hasAddition = false;

        double total = addition1Price + addition2Price + addition3Price + addition4Price + price;

        System.out.println("Eklenen malzemeler: ");

        if (addition1Name != null && addition1Price != 0) {
            System.out.println(addition1Name + " :" + addition1Price);
            hasAddition = true;
        }
        if (addition2Name != null && addition2Price != 0) {
            System.out.println(addition2Name + " :" + addition2Price);
            hasAddition = true;
        }
        if (addition3Name != null && addition3Price != 0) {
            System.out.println(addition3Name + " :" + addition3Price);
            hasAddition = true;
        }
        if (addition4Name != null && addition4Price != 0) {
            System.out.println(addition4Name + " :" + addition4Price);
            hasAddition = true;
        }

        if(!hasAddition){
            System.out.println("Ek malzeme eklenmedi.");
        }

        System.out.println("Toplam: " + total);

    }

}
