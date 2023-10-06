package Week5.Ex89;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int lowerLimit, int upperLimit){
        this.value =  lowerLimit;
        this.upperLimit = upperLimit;
    }
    public void next(){
        if(this.value <= upperLimit){
            this.value++;
        }
        if(this.value > upperLimit){
            this.value = 0;
        }
    }
    public String toString(){
      return "" + String.format("%02d", this.value);
    }
}
