package Week1;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] arg){
        //Get user input
        System.out.println("Type a number: ");
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        //Check if number is even or odd
        if( number % 2 == 0){
            System.out.println("Number " + number + " is even!");
        } else {
            System.out.println("Number " + number + " is odd!");
        }
    }
}
