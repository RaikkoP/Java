package Week4;
import java.util.*;

public class Ex71 {

    public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2){
        for (int number : list2) {
            if (!list1.contains(number)) {
                list1.add(number);
            }
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(4);
        list2.add(0);

        smartCombine(list1, list2);

        System.out.println(list1); // prints [4, 3, 5, 10, 7]

        System.out.println(list2); // prints [5, 10, 7]

    }
}
