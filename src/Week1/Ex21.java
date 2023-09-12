package Week1;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[]arg){
        //Get year
        Scanner input = new Scanner(System.in);
        System.out.println("Type a year: ");
        int year = Integer.parseInt(input.nextLine());
        //Check for leap year
        boolean leapYear = false;
        if(year % 100 == 0){
            if(year % 400 == 0){
                leapYear = true;
            } else {
                leapYear = false;
            }
        } else if (year % 4 == 0){
            leapYear = true;
        } else {
            leapYear = false;
        }
        if(leapYear){
            System.out.println("This year is a leap year.");
        } else if (!leapYear){
            System.out.println("This year is not a leap year.");
        }
    }
}
