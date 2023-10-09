package Week7.Ex4;

import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    public Container(int weight){
        this.maxWeight = weight;
        this.suitcases = new ArrayList<Suitcase>();
    }
    public void printThings(){
        for(Suitcase suitcase : this.suitcases){
            suitcase.printThings();
        }
    }
    public void addSuitcase(Suitcase suitcase){
        int containerWeight = 0;
        for(Suitcase item : this.suitcases){
            containerWeight += item.totalWeight();
        }
        containerWeight += suitcase.totalWeight();
        if(containerWeight > this.maxWeight){
            return;
        }
        this.suitcases.add(suitcase);
    }
    public String toString(){
        int suitcaseCount = 0;
        int containerWeight = 0;
        for(Suitcase suitcase : this.suitcases){
            suitcaseCount++;
            containerWeight+= suitcase.totalWeight();
        }
        if(suitcaseCount <= 0){
            return "empty (0 kg)";
        }
        if(suitcaseCount == 1){
            return "" + suitcaseCount + " suitcase " + "(" + containerWeight + " kg)";
        }
        return "" + suitcaseCount + " suitcases (" + containerWeight + " kg)";
    }
}
