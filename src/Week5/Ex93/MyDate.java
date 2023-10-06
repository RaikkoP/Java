package Week5.Ex93;


public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getAge(int day,int month,int year) {
        if(this.year == year){
            return 0;
        }
        if(this.year < year){
            if(this.month < month){
                return year - this.year;
            }
            if(this.month == month && this.day > day){
                return year - this.year -1;
            }
        }
        return year - this.year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

}
