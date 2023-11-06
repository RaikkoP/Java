package Week9.Ex21;

import java.io.File;
import java.util.Scanner;

public class Printer {
    private File fileName;
    public Printer(String fileName) throws Exception{
        try {
            this.fileName = new File(fileName);
        } catch (Exception e) {
            System.out.println("Couldn't find file. ERROR: " + e.getMessage());
            return;
        }
    }
    public void printLinesWhichContain(String word){
        Scanner reader = null;
        try {
            reader = new Scanner(fileName);
        } catch (Exception e) {
            System.out.println("Couldn't read the file. ERROR: " + e.getMessage());
            return;
        }
        if(word.equals("")){
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            return;
        }
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if(line.contains(word)){
                System.out.println(line);
            }
        }
    }
}
