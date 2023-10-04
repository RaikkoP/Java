package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        String twiceEntered = "";
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if(word.isEmpty()){
                System.out.println("Do not enter an empty string");
            } else if (words.contains(word)) {
                twiceEntered = word;
                break;
            } else {
                words.add(word);
            }
        }
        System.out.println("You gave the word " + twiceEntered + " twice");
    }
}
