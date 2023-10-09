package Week7.Ex7;

import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String, String> words;
    public Dictionary() {
        this.words = new HashMap<String, String>();
    }
    public String translate(String word){
        if(this.words.containsKey(word)){
            return this.words.get(word);
        }
        return "No word in dictionary";
    }
    public void add(String word, String translation){
        this.words.put(word, translation);
    }
    public int amountOfWords(){
        return this.words.size();
    }
    public ArrayList<String> translationList(){
        ArrayList<String> output = new ArrayList<String>();
        for(String key : this.words.keySet()){
            output.add("" + key  + " = " + this.words.get(key));
        }
        return output;
    }
}
