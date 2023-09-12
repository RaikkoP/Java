package Week2;
import java.util.Scanner;
public class Ex38 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many times? ");
        int numbers = Integer.parseInt(input.nextLine());
        int i = 1;
        while(i <= numbers){
            printText();
            i++;
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}