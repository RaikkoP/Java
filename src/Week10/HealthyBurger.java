package Week10;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super("Healthy", meat ,"Rhye bread", price);
    }
    public void addHealthyAddition1(String name, double price){
        this.price += price;
        System.out.println("Added " + name + " for an extra " + price);
    }
    public void addHealthyAddition2(String name, double price){
        this.price += price;
        System.out.println("Added " + name + " for an extra " + price);
    }
}
