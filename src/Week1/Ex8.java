package Week1;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int y = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the numbers: " + (x+y));
    }
}
