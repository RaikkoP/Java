package Week7.Ex4;

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things;
    public Suitcase(int weight){
        this.maxWeight = weight;
        this.things = new ArrayList<Thing>();
    }
    public Thing heaviestThing(){
        int indexOfHeaviest = 0;
        for( Thing thing : this.things){
            if(thing.getWeight() > indexOfHeaviest){
                indexOfHeaviest = this.things.indexOf(thing);
            }
        }
        return(this.things.get(indexOfHeaviest));
    }
    public void printThings(){
        if(this.things.size() == 0) {
            System.out.println("Suitcase Empty");
        }
        for(Thing thing : this.things){
            System.out.println(thing.getName() + " (" + thing.getWeight() + "kg)");
        }
    }
    public int totalWeight(){
        int totalWeight = 0;
        for(Thing item : this.things){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    public void addThing(Thing thing){
        int suitcaseWeight = totalWeight();
        suitcaseWeight += thing.getWeight();
        if(suitcaseWeight > this.maxWeight){
            return;
        }
        this.things.add(thing);
    }
    public String toString(){
        int thingCount = 0;
        int weightCount = 0;
        weightCount = 0;
        for(Thing thing : this.things){
            thingCount++;
            weightCount += thing.getWeight();
        }
        if(thingCount <= 0){
            return "empty (0 kg)";
        }
        if(thingCount == 1){
            return "" + thingCount + " thing " + "(" + weightCount + " kg)";
        }
        return "" + thingCount + " things " + "(" + weightCount + " kg)";
    }
}
