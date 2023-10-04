package Week3;
import java.util.*;

public class Ex65 {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(String word : list){
            numbers.add(word.length());
        }
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }
}
