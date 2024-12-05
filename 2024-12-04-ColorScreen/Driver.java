import java.util.*;

public class Driver {
    public static void main(String[] args){
        drawBorder();


    }

    public static void drawBorder(){
        for (int col = 0; col <= 80; col++){
            Text.go(1,col);
            System.out.println(" ");
            Text.go(30,col);
            System.out.println(" ");
        }

        for (int row = 0; row <= 30; row++){
            Text.go(row,1);
            System.out.println(" ");
            Text.go(row, 30);
            System.out.println(" ");
        }
    }
}
