package Week2;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Until what? ");
        int number = Integer.parseInt(input.nextLine());
        int result = 0;
        int i = 1;

        while (i <= number){
            result += i;
            i++;
        }
        System.out.println("Sum is " + result);
    }
}
