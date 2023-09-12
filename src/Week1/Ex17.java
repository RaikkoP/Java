package Week1;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] arg){
        //User inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Type in the first number: ");
        int firstInput = Integer.parseInt(input.nextLine());

        System.out.println("Type the second number: ");
        int secondInput = Integer.parseInt(input.nextLine());

        //Check greater number
        if(firstInput > secondInput){
            System.out.println("Greater number: " + firstInput);
        } else if (firstInput < secondInput){
            System.out.println("Greater number: " + secondInput);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
