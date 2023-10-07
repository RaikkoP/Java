package Week6.Ex101;

public class StringUtils {
    public static boolean included(String word, String searched){
        if(word.toUpperCase().trim().contains(searched.trim().toUpperCase())){
            return true;
        }
        return false;
    }
}
