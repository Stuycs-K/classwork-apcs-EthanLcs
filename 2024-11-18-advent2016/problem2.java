import java.io.*;
import java.util.*;

public class problem2{

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("problem2.txt"));
        String code = "";

        char[][] keypad = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
        };
        
        int row = 1, col = 1;

        while (sc.hasNextLine()){
            String instructions = sc.nextLine();
            for (int i = 0; i < instructions.length(); i++){
                char move = instructions.charAt(i);
                if (move == 'U' && row > 0) row--;
                if (move == 'D' && row < 2) row++;
                if (move == 'L' && col > 0) col--;
                if (move == 'R' && col < 2) col++;

            }
            code += keypad[row][col];
        }
        sc.close();
        System.out.println(code);
    }
}
