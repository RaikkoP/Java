package Week3;

import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String firstWord = input.next();
        System.out.print("Type the second word: ");
        String secondWord = input.next();
        if(!firstWord.contains(secondWord)){
            System.out.println("The word '" + secondWord + "' is not found in the word '" + firstWord + "'");
        } else {
            System.out.println("The word '" + secondWord + "' is found in the word '" + firstWord + "'");
        }
    }
}
