package Week5.Ex93;

import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;

    public Person(String name, MyDate date){
        this.name = name;
        this.birthday = date;
    }

    public Person(String name){
        this.name = name;
        this.birthday = new MyDate(
                Calendar.getInstance().get(Calendar.DATE),
                Calendar.getInstance().get(Calendar.MONTH) + 1,
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public int age() {
        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return this.birthday.getAge(day, month, year);
    }

    public boolean olderThan(Person compare) {
        if(this.age() <= compare.age()){
            return false;
        }
        return true;
    }

    public String getName(){
        return this.name;
    }

    public String toString() {
        return this.name +", born "+ this.birthday;
    }
}
