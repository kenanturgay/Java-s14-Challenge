import org.workintech.burger.DeluxBurger;
import org.workintech.burger.Hamburger;
import org.workintech.burger.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Hamburger hamburger = new Hamburger("Basic", "Beef", 23);

        hamburger.addHamburgerAddition1("Tomato", 0.27);

        hamburger.addHamburgerAddition2("Lettuce", 0.75);

        hamburger.addHamburgerAddition3("Cheese", 1.13);

        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", "Beef", 23);

        healthyBurger.addHamburgerAddition1("Egg", 5.43);

        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxBurger db = new DeluxBurger();

        db.addHamburgerAddition3("Should not do this", 50.53);

        db.itemizeHamburger();
    }
}