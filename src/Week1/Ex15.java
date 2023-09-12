package Week1;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] arg){
        //Ask user for age
        System.out.println("How old are you? ");
        Scanner input = new Scanner(System.in);
        int age = Integer.parseInt(input.nextLine());

        //Check if user is 18
        if (age >= 18){
            System.out.println("You have reached the age of majority");
        } else {
            System.out.println("You have not yet reached the age of majority");
        }
    }
}
