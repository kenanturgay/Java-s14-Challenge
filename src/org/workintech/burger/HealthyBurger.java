package org.workintech.burger;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;


    public HealthyBurger(String name, String meat, double price) {
        super(name, meat, price, "Brown Rye Roll");
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra1Price = healthyExtra1Price;
        this.healthyExtra2Price = healthyExtra2Price;
    }


    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public void setHealthyExtra1Name(String healthyExtra1Name) {
        this.healthyExtra1Name = healthyExtra1Name;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public void setHealthyExtra2Name(String healthyExtra2Name) {
        this.healthyExtra2Name = healthyExtra2Name;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public void setHealthyExtra1Price(double healthyExtra1Price) {
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    public void setHealthyExtra2Price(double healthyExtra2Price) {
        this.healthyExtra2Price = healthyExtra2Price;
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public void itemizeHamburger() {
        super.itemizeHamburger();

        double total = getPrice();

        if (healthyExtra1Name != null && healthyExtra1Price != 0) {
            System.out.println(healthyExtra1Name + ": $" + healthyExtra1Price);
            total += healthyExtra1Price;
        }

        if (healthyExtra2Name != null && healthyExtra2Price != 0) {
            System.out.println(healthyExtra2Name + ": $" + healthyExtra2Price);
            total += healthyExtra2Price;
        }

        // Güncellenmiş toplam ücreti ekrana bas
        System.out.println("Toplam (HealthyBurger dahil): $" + total);
    }
}
