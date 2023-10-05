package Week4.Ex81;
import java.util.Random;

public class PasswordRandomizer {
    private int size;

    public PasswordRandomizer (int length) {
        this.size = length;
    }

    public String createPassword() {
        String charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVXYZ123456789";
        String password = "";
        Random random = new Random();
        while(password.length() < this.size){
            char symbol = charset.charAt(random.nextInt(charset.length()));
            password += symbol;
        }
        return password;
    }
}
