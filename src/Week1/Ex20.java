package Week1;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] arg){
        //DATABASE INFORMATSION
        String username1 = "alex";
        String username2 = "emily";
        String password1 = "mightyducks";
        String password2 = "cat";
        //USER INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("Type your username: ");
        String userInput = input.nextLine();
        System.out.println("Type your password: ");
        String passInput = input.nextLine();
        //LOGIN CHECK
        if(userInput.equals(username1)  && passInput.equals(password1)){
            System.out.println("You are now logged into the system!");
        } else if (userInput.equals(username2) && passInput.equals(password2)){
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
