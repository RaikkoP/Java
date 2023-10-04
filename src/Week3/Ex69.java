package Week3;
import java.util.*;

public class Ex69 {

    public static boolean palindrome(String text) {
        // write your code here
        String reversedText = "";
        for(int i = text.length()-1; i >= 0; i--){
            reversedText += text.charAt(i);
        }
        if(text.equals(reversedText)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
