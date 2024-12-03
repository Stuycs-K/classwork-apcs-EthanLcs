import java.io.*;
import java.util.*;

public class problem2two{

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("problem2.txt"));
        String code = "";

        char[][] keypad = {
            {'-','-','1','-','-'},
            {'-','2','3','4','-'},
            {'5','6','7','8','9'},
            {'-','A','B','C','-'},
            {'-','-','D','-','-'}
        };
        
        int row = 2, col = 0;

        while (sc.hasNextLine()){
            String instructions = sc.nextLine();
            for (int i = 0; i < instructions.length(); i++){
                char move = instructions.charAt(i);

                int nrow =  row, ncol = col;
                if (move == 'U') nrow--;
                if (move == 'D') nrow++;
                if (move == 'L') ncol--;
                if (move == 'R') ncol++;

                if (nrow >= 0 && nrow < 5 && ncol >= 0 && ncol < 5 && keypad[nrow][ncol] != '-'){
                    row = nrow;
                    col = ncol;
                }

            }
            code += keypad[row][col];
        }
        sc.close();
        System.out.println(code);
    }
}
