public class MyArrays {
  public static int[] returnCopy (int[] ary){
    int[] thing = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      thing[i] = ary[i];
    }
    return thing;
  }
  public static int[] concatArray(int[] ary1, int[] ary2){
    int sumLength = ary1.length + ary2.length;
    int[] arr = new int[sumLength];
    for (int i = 0; i < ary1.length; i++){
      arr[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++){
      arr[ary1.length + i] = ary2[i];
    }
    return arr;
  }

  public static String arrayToString(int[] nums){
    if (nums.length == 0){
      return "[]";
    }
    String initial = "";
    initial = initial + "[";  
    for (int i = 0; i < nums.length; i++){
      initial += nums[i];
      if (i < nums.length - 1){
        initial += ", ";
      }
    }
    initial += "]";
    return initial;
  }
  public static void main(String[] args){
    int[] original = {0,1,2,3,4};
    int[] copy = returnCopy(original);

    System.out.println("Original and returnCopy Test " + java.util.Arrays.equals(original,copy));

    int[] part1 = {1,2};
    int[] part2 = {3,4};

    System.out.println("Concated Array is " + java.util.Arrays.toString(concatArray(part1, part2)));

    int[] stringArray = {1, 2, 3, 4};
    
    System.out.println("int array to strings " + (arrayToString(stringArray)));
  }
}
  


