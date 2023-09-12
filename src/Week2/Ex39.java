package Week2;

public class Ex39 {
    private static void printStars(int amount){
        int i = 1;
        while(i <= amount){
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }

    private static void printSquare(int sideSize){
        int i = 1;
        int j = 1;
        while(i <= sideSize){
            while(j <= sideSize){
                printStars(sideSize);
                j++;
            }
            i++;
        }
    }

    private static void printRectangle(int width, int height){
        int i = 1;
        int j = 1;
        while(i <= height){
            while(j <= width){
                printStars(width);
                j++;
                break;
            }
            i++;
        }
    }

    private static void printTriangle(int size){
        int i = 1;
        while(i <= size){
                printStars(i);
                i++;
        }
    }

    public static void main(String[] args){
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n");
        printSquare(4);
        System.out.println("\n");
        printRectangle(17,3);
        System.out.println("\n");
        printTriangle(4);
    }
}
