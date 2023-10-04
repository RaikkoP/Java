package Week3;
import com.sun.jdi.IntegerValue;

import java.util.*;

public class Ex63 {

    public static int sum(ArrayList<Integer> list){
        int total = 0;
        for(int number : list){
            total += number;
        }
        return total;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The sum: " + sum(list));

        list.add(10);

        System.out.println("the sum: " + sum(list));
    }
}
