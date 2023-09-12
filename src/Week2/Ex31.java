package Week2;
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("First: ");
        int first = Integer.parseInt(input.next());
        System.out.print("Last: ");
        int last = Integer.parseInt(input.next());

        while(first <= last){
            System.out.println(first);
            first++;
        }
    }
}
