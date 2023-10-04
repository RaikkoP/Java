package Week3;
import java.util.Scanner;

public class Ex56 {

    public static String reverse(String text){
        String answer = "";
        int i = text.length()-1;
        while(i >= 0){
            answer += text.charAt(i);
            i--;
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
