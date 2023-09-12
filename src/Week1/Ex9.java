package Week1;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] arg){
        //Variables
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number: ");
        int x = Integer.parseInt(input.nextLine());
        System.out.print("Type another number: ");
        int y = Integer.parseInt(input.nextLine());

        //Math
        double answer = 1.0 * x / y;

        //Output
        System.out.println("Division: " + x + " /" + y + " = " + answer);

    }
}
