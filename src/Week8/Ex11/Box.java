package Week8.Ex11;

import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight;
    private double currentWeight;
    private ArrayList<ToBeStored> items;

    public Box(double weight){
        this.maxWeight = weight;
        this.items = new ArrayList<>();
        this.currentWeight = 0;
    }
    public void add(ToBeStored item){
        if (currentWeight < maxWeight){
            this.items.add(item);
            currentWeight += item.weight();
        }
    }
    @Override
    public double weight() {
        return currentWeight;
    }
    public String toString() {
        return "Box: " + items.size() + " things, total weight " + this.currentWeight + " kg";
    }
}
