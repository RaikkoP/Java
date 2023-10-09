package Week7.Ex4;

public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        int i = 1;
        while(i <= 100){
            Suitcase brickSuitcase = new Suitcase(i);
            Thing brick = new Thing("Brick", i);
            brickSuitcase.addThing(brick);
            container.addSuitcase(brickSuitcase);
            i++;
        }
    }
}
