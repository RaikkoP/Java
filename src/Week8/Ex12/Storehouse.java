package Week8.Ex12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    public Storehouse(){
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }

    public boolean take(String product){
        if(stock(product) > 0){
            stocks.replace(product,stock(product)-1);
            return true;
        }
        return false;
    }
    public Set<String> products(){
        Set<String> productList = new HashSet<String>();
        for(String key : this.prices.keySet()){
            productList.add(key);
        }
        return productList;
    }

    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int stock(String product){
        if(this.stocks.containsKey(product)){
            return this.stocks.get(product);
        }
        return 0;
    }

    public int price(String product){
        if(this.prices.containsKey(product)){
            return this.prices.get(product);
        }
        return -99;
    }
}
