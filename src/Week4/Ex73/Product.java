package Week4.Ex73;

public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String productName, double productPrice, int productAmount){
        this.name = productName;
        this.price = productPrice;
        this.amount = productAmount;
    }

    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }
}
