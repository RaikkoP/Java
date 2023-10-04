package Week3;
import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = input.nextLine();
        int i = 1;
        if(name.length() >= 3){
            while(i <= 3){
                System.out.println(i + ". character: " + name.charAt(i-1));
                i++;
            }
        }
    }
}
