package Week7.Ex7;
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void add(){
        System.out.println("In Finnish: ");
        String finnishWord = reader.next();
        System.out.println("Translation: ");
        String translation = reader.next();
        this.dictionary.add(finnishWord, translation);
    }

    public void translate(){
        System.out.println("Give a word: ");
        String finnishWord = reader.next();
        System.out.println(this.dictionary.translate(finnishWord));
    }

    public void start(){
        System.out.println("Statements: ");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quit the text user interface");

        while(true){
            System.out.print("Statement: ");
            String input = reader.next();
            if(input.equals("quit")){
                System.out.println("Cheers");
                break;
            }
            switch (input){
                case "add":
                    add();
                    break;
                case "translate":
                    translate();
                    break;
                default:
                    System.out.println("Unknown statement");
                    break;
            }
        }
        }
    }
