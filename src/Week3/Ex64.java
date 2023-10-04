package Week3;
import java.util.*;
public class Ex64 {

    public static double average(ArrayList<Integer> list){
        int total = 0;
        for(int number : list){
            total += number;
        }
        return total/(double)list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
