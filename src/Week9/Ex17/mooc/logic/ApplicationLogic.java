package Week9.Ex17.mooc.logic;
import Week9.Ex17.mooc.ui.UserInterface;

public class ApplicationLogic  {

    private UserInterface ui;
    public ApplicationLogic(UserInterface ui){
        this.ui = ui;
    }
    public void execute(int howManyTime){
        int i = 0;
        while(i < howManyTime) {
            System.out.println("The application logic works");
            ui.update();
            i++;
        }
    }
}
