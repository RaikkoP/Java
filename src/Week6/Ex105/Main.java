package Week6.Ex105;

public class Main {
    public static void main(String[] args){
        GuessingGame game = new GuessingGame();

// we play two rounds
        game.play(1,10);  // value to be guessed now within range 1-10
        game.play(1,100);  // value to be guessed now within range 10-99
    }
}
