package Week2;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.println("The the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;
        System.out.println("The the second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;
        System.out.println("The the third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;
        System.out.println("Sum: " + sum);
    }
}
