package Week1;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(input.nextLine());

        if(number < 0){
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is positive");
        }
    }
}
