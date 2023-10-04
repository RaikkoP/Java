package Week3;
import java.util.*;
import java.lang.Math;

import static java.lang.Math.pow;

public class Ex67 {
    public static double variance(ArrayList<Integer> list){
        double variance = 0;
        double total = 0;
        for( int number : list){
            total += number;
        }
        double average_number = total / list.size();
        for( int number : list) {
            variance += pow((number - average_number),2);
        }
        variance = variance/(list.size()-1);
        return variance;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }
}
