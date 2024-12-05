import java.util.*;

public class Driver {
    public static void main(String[] args){
        drawBorder();

        int[] randomNumbers = threeRandomInt();



    }

    public static void drawBorder(){
        Text.color(Text.WHITE, Text.background(Text.BLUE));
        for (int col = 0; col <= 80; col++){
            Text.go(1,col);
            System.out.println(" ");
            Text.go(30,col);
            System.out.println(" ");
        }

        for (int row = 0; row <= 30; row++){
            Text.go(row,1);
            System.out.println(" ");
            Text.go(row, 80);
            System.out.println(" ");
        }
    }

    private static int[] threeRandomInt(){
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++){
            nums[i] = (int)Math.random();
        }
        return nums;    
    }

    public static void drawSeperator(){
        Text.go(3,1);
        for (int col = 0; col <= 80; col++){
            System.out.println("-");
        }
    }

    public static void draw(){
        int spacing = 80/ 
    }
}
