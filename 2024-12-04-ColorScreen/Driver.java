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
            System.out.print(" ");
            Text.go(30,col);
            System.out.print(" ");
        }

        for (int row = 0; row <= 30; row++){
            Text.go(row,1);
            System.out.print(" ");
            Text.go(row, 80);
            System.out.print(" ");
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
            System.out.print("-");
        }
    }

    public static void draw(int[] numbers){
        int spacing = 80 / numbers.length + 1;
        for (int i = 0; i < numbers.length; i++){
            Text.go(2, spacing *(i + 1));
            if (numbers[i] < 25) Text.color(Text.RED, Text.BRIGHT);
            else if (numbers[i] > 75) Text.color(Text.GREEN, Text.BRIGHT);
            else {
                Text.color(Text.WHITE);
            }
        }
    }
}
