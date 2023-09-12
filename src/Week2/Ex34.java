package Week2;
import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(input.nextLine());
        int sum = 1;
        int i = 1;

        if (number == 0){
            System.out.println("The sum is " + sum);
        }

        while(i <= number){
            sum *= i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
