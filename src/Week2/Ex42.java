package Week2;
import java.util.Scanner;

public class Ex42 {
    private static void gameOn(){
        boolean startGame = false;
        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************");
        System.out.println("");
        printName();
        System.out.println("Yes - Play Hangman");
        System.out.println("No - Close application");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if(userInput.equals("yes") || userInput.equals("Yes")){
            startGame = true;
        }
        printMenu();
        while(startGame){
            userInput = input.nextLine();
            if(userInput == ""){
                printMenu();
            }
            if(userInput == "quit"){
                startGame = false;
            }
        }
        printName();
    }
    private static void printMenu(){
        System.out.println("************");
        System.out.println("*   Menu   *");
        System.out.println("************");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
    private static void printStatus(){

    }
    private static void printName(){
        System.out.println("Greetings player, what is your name?");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        System.out.println("Welcome " + userInput + "! Would you like to play a game of hangman?");
    }
    private static void printMan(){

    }
    private static void guess(String letter){

    }
    public static void main(String[] args){
        gameOn();
    }
}
