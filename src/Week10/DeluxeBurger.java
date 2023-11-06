package Week10;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", "Pure White", 14.54);
        System.out.println("Added Chips for an extra " + 2.75);
        this.price += 2.75;
        System.out.println("Added Drink for an extra " + 1.81);
        this.price += 1.81;
    }
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe");
    }
    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe");
    }
    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe");
    }
    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe");
    }
}
