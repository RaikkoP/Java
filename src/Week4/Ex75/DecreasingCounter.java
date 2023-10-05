package Week4.Ex75;

public class DecreasingCounter {
    private int value;
    private int savedValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.savedValue = value;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if(this.value == 0){
            return;
        }
        this.value--;
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = savedValue;
    }
}
