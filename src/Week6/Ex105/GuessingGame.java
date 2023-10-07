package Week6.Ex105;
import java.util.*;

public class GuessingGame {
    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit){
        instructions(lowerLimit, upperLimit);
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);
        int count = 1;
        while(count <= maxQuestions){
            if(isGreaterThan(average(upperLimit, lowerLimit))){
                lowerLimit = average(upperLimit, lowerLimit);
                count++;
            } else {
                upperLimit = average(upperLimit, lowerLimit);
                count++;
            }
        }
        System.out.println("The number you're thinking of is " + upperLimit);
    }

    public void instructions(int lowerLimit, int upperLimit){
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");
        System.out.println("I promise you that I can the number you are thinking of with " + maxQuestions);
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    public static int howManyTimesHalvable(int number){
        return(int) (Math.log(number) / Math.log(2)) +1;
    }

    public boolean isGreaterThan(int value){
        System.out.println("Is your number greater than " + value + "? (y/n)");
        if(this.reader.nextLine().equals("y")){
            return true;
        };
        return false;
    }

    public int average(int firstNumber, int secondNumber){
       return Math.round((firstNumber + secondNumber)/2);
    }
}
