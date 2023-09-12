package Week2;
import java.util.Scanner;
public class Ex36 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("The numbers: ");
        int number = 0;
        float result = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        while(number != -1){
            number = Integer.parseInt(input.nextLine());
            if(number != -1){
                result += number;
                count++;
                if(number % 2 == 0){
                    even++;
                } else {
                    odd++;
                }
            }
        };
        float average = result / count;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + result);
        System.out.println("How many numbers:  " + count);
        System.out.println("Average:  " + average);
        System.out.println("Even numbers:  " + even);
        System.out.println("Odd nubmers:  " + odd);
    }
}
