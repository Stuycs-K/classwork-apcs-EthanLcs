import java.io.*;
import java.util.*;

public class problem1{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("problem1.txt"));
        String[] directions = sc.nextLine().split(", ");
        sc.close();

        int x = 0;
        int y = 0;
        int dir = 0;

        for (int i = 0; i < directions.length; i++){
            char turn = directions[i].charAt(0);
            int steps = Integer.parseInt(directions[i].substring(1));

            if (turn == 'R'){
                dir = (dir + 1) % 4;
            } else if (turn == 'L'){
                dir = (dir + 3) % 4;
            }

            if (dir == 0) y += steps;
            if (dir == 1) x += steps;
            if (dir == 2) y -= steps;
            if (dir == 3) x -= steps;
        }
        System.out.println(Math.abs(x) + Math.abs(y));
    }


  
}