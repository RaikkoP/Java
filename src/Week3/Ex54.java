package Week3;

import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = input.nextLine();
        System.out.println("Length of first part: ");
        int firstPart = Integer.parseInt(input.nextLine());
        System.out.println("Result: " + word.substring(word.length()-firstPart));
    }
}
