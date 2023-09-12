package Week1;
import java.util.Scanner;

public class Ex19 {
    //Create a program that asks for the user's age and checks that it is reasonable
    // (at least 0 and at most 120).Create a program that asks for the user's age and checks that it is
    // reasonable (at least 0 and at most 120).

    public static void main(String[] arg){
        //VARIABLES
        Scanner input = new Scanner(System.in);
        int age;
        boolean validAge = false;
        //INPUT
        System.out.println("How old are you? ");
        age = Integer.parseInt(input.nextLine());
        //LOGIC
        if(age <= 0){
            validAge = false;
        } else {
            validAge = true;
        }
        //OUTPUT
        if(!validAge){
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
    }
}
