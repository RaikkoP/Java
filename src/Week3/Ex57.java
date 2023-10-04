package Week3;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex57 {

    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if(word.isEmpty()){
                break;
            } else {
                words.add(word);
            }
        }
        System.out.println("You typed the following words: ");
        for(String word : words){
            System.out.println( word );
        }
    }
}
