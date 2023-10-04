package Week3;

public class Ex45 {
    public static int greatest(int number1, int number2, int number3){
        int firstTest = Math.max(number1, number2);
        return Math.max(firstTest, number3);
    }
    public static void main(String[] args){
        int answer = greatest(2,7,3);
        System.out.println("Greatest: " + answer);
    }
}
