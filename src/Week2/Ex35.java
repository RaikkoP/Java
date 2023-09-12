package Week2;
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(input.nextLine());
        int result = 0;
        int i = 0;

        while(i <= number){
            result += (int)Math.pow(2, i);
            i++;
        }

        System.out.println("The result is " + result);
    }
}
