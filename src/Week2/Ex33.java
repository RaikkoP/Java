package Week2;
import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("First: ");
        int firstNumber = Integer.parseInt(input.nextLine());
        System.out.println("Last: ");
        int lastNumber = Integer.parseInt(input.nextLine());
        int sum = 0;

        while(firstNumber <= lastNumber){
            sum += firstNumber;
            firstNumber++;
        }
        System.out.println("The sum is " + sum);
    }
}
