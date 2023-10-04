package Week2;
import java.util.Random;
import java.util.Scanner;
public class Ex41 {
    private static int drawNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return randomNumber;
    }
    public static void main(String[] args){
        int randomNumber = drawNumber();
        int count = 0;
        Scanner input = new Scanner(System.in);
        boolean correctGuess = false;
        while (!correctGuess){
            System.out.println("Guess a number: ");
            int guess = Integer.parseInt(input.nextLine());
            if(guess == randomNumber){
                correctGuess = true;
            } else if (guess < randomNumber){
                count++;
                System.out.println("The number is greater, guesses made: " + count);
            } else if (guess > randomNumber){
                count++;
                System.out.println("The number is lesser, guesses made: " + count);
            }
        }
        System.out.println("Congratulations, your guess is correct!");
    }
}
