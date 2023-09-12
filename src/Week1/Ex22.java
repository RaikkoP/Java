package Week1;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password = "carrot";
        boolean needPassword = true;

        while(needPassword){
            System.out.println("Type the password: ");
            String userInput = input.nextLine();
            if(userInput.equals(password)){
                needPassword = false;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("The secret is: jryy qbar!");
    }
}
