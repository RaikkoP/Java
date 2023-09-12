package Week2;

public class Ex40 {
    private static void printStars(int amount){
        int i = 1;
        while(i <= amount){
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }
    private static void printWhitespaces(int spaces){
        int i = 1;
        while(i <= spaces){
            System.out.print(" ");
            i++;
        }
    }
    private static void printTriangle(int size){
        int i = size;
        int j = 0;
        while(i >= 0){
            printWhitespaces(i);
            i--;
            while(j <= size){
                printStars(j);
                j++;
                break;
            }
        }
    }
    private static void xmasTree(int height){
         int i = height;
         int j = 0;
         int k = 0;
         while(i >= 0){
             printWhitespaces(i);
             while(j <= height){
                 if(j == 1){
                     printStars(j);
                 } else {
                     printStars((j + (j-1)));
                 }
                 if(j == height){
                     while(k <= 1){
                         printWhitespaces((j + (j-3))/2);
                         printStars(3);
                         k++;
                     }
                 }
                 j++;
                 break;
             }
             i--;
         }
    }
    public static void main(String[] args){
        printTriangle(4);
        xmasTree(4);
        xmasTree(10);
        xmasTree(6);
    }
}
