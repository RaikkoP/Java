package Week1;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] arg){
        //Vars
        Scanner input = new Scanner(System.in);
        System.out.print("Type the radius: ");
        int x = Integer.parseInt(input.nextLine());
        //Calculation
        double answer = 2 * Math.PI * x;
        //Output
        System.out.println("Circumference of the circle: " + answer);
    }
}
