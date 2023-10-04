package Week3;
import java.util.*;

public class Ex66 {
    public static int greatest(ArrayList<Integer> list){
        int biggestNumber = 0;
        for(int number : list){
            if(number > biggestNumber){
                biggestNumber = number;
            }
        }
        return biggestNumber;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(29);
        list.add(21);
        list.add(27);
        list.add(1);

        System.out.println("The greatest number is: " + greatest(list));
    }
}
