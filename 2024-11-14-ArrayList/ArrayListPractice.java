import java.util.*;

public class ArrayListPractice {
   public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> arr = new ArrayList<String>();
    for (int i = 0; i < size; i++){
        arr.add( 10 * Math.random() + "");
    }
    return arr;
   }
   
    public static void main(String[] args) {
        
    }
}