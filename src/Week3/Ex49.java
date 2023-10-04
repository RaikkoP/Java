package Week3;

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = input.nextLine();
        System.out.println("Last character: " + name.charAt(name.length()-1));
    }
}
