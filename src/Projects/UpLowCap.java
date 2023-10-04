package Projects;
import java.util.*;

public class UpLowCap {
    public static String[] seperateString(String words){
        String[] list = words.trim().split("\\s+");
        for (int i = 0; i < list.length;i++){
            list[i] = list[i].trim();
        }
        return list;
    }

    public static ArrayList<String> upLowCap(String[] list){
        ArrayList<String> result = new ArrayList<String>();
        //Map
        HashMap<String, Integer> tags = new HashMap<String, Integer>();
        tags.put("(up)",1);
        tags.put("(low)",2);
        tags.put("(cap)",3);
        tags.put("(up,",4);
        tags.put("(low,",5);
        tags.put("(cap,",6);

        //Check tags
        for(int i = 0; i < list.length; i++){
            Integer code = tags.get(list[i]);
            if(code == null){
                result.add(list[i]);
            } else {
                switch(code){
                    case 1:
                        list[i+1] = list[i+1].toUpperCase();
                        break;
                    case 2:
                        list[i+1] = list[i+1].toLowerCase();
                        break;
                    case 3:
                        list[i+1] = list[i+1].substring(0, 1).toUpperCase() + list[i+1].substring(1);
                        break;
                    case 4:
                        int num = getPrefixNumber(list[i+1]) + i + 1;
                        list[i+1] = "";
                        for(int j = num; j >= i; j--){
                            list[j] = list[j].toUpperCase();
                        }
                        break;
                    case 5:
                        num = getPrefixNumber(list[i+1]) + i + 1;
                        list[i+1] = "";
                        for(int j = num; j >= i; j--){
                            list[j] = list[j].toLowerCase();
                        }
                        break;
            }
            }
        }

        System.out.println(Arrays.toString(list));
        return result;
    }

    public static int getPrefixNumber(String word){
        int num = 0;
        num = Integer.parseInt(word.replace(')',' ').trim());
        System.out.println(num);
        return num;

    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(seperateString("why are (up, 2) you gay (up) obamna")));
        upLowCap(seperateString("why are (up, 2) you gay (up) obamna"));
        System.out.println(upLowCap(seperateString("(low, 2) WHY ARE (up, 2) you gay (up) obamna")));
    }
}
