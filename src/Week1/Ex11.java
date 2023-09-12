package Week1;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] arg){
        //Vars
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number: ");
        int x = Integer.parseInt(input.nextLine());
        System.out.print("Type another number: ");
        int y = Integer.parseInt(input.nextLine());
        //Calculation
        int answer = Math.max(x,y);
        //Output
        System.out.println("The bigger number is: " + answer);
    }
}
