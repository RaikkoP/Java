package Week3;
import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = input.nextLine();
        int i = 1;
        System.out.print("In reverse order: ");
        while(i <= name.length()){
            System.out.print(name.charAt(name.length()-i));
            i++;
        }
    }
}
