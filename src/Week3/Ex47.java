package Week3;
import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = input.nextLine();
        System.out.println("Number of characters: " + name.length());
    }
}
