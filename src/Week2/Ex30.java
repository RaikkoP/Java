package Week2;
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int counter = 1;

        System.out.print("Up to what number? ");
        int max = Integer.parseInt(input.next());

        while (counter <= max){
            System.out.println(counter);
            counter++;
        }
    }
}
