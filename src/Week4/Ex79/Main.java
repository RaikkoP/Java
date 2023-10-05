package Week4.Ex79;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        int inputNumber = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Type numbers: ");
        while(inputNumber >= 0){
            inputNumber = Integer.parseInt(input.nextLine());
            if(inputNumber < 0) {
                continue;
            }
            if(inputNumber % 2 == 0){
                even.addNumber(inputNumber);
            }
            if(inputNumber % 2 != 0){
                odd.addNumber(inputNumber);
            }
            stats.addNumber(inputNumber);
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }
}
