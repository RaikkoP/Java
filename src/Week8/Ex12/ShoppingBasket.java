package Week8.Ex12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> basket;
    public ShoppingBasket(){
        basket = new HashMap<String, Purchase>();
    }
    public void add(String product, int price){
        if(basket.containsKey(product)){
            basket.get(product).increaseAmount();
            return;
        }
        basket.put(product, new Purchase(product, 1, price));

    }
    public int price(){
        int totalPrice = 0;
        for(Purchase item : basket.values()){
            totalPrice += item.price();
        }
        return totalPrice;
    }
    public void print(){
        for(Purchase item : basket.values()){
            System.out.println(item);
        }
    }
}
