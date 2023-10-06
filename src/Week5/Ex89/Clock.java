package Week5.Ex89;

public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(hoursAtBeginning,23);
        this.minutes = new BoundedCounter(minutesAtBeginning,59);
        this.seconds = new BoundedCounter(secondsAtBeginning,59);
    }
    public void tick(){
      this.seconds.next();
      if(this.seconds.toString().equals("59")){
          this.minutes.next();
          if(this.minutes.toString().equals("00")){
              this.hours.next()   ;
          }
      }
    }

    public String toString(){
        return "" + this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
