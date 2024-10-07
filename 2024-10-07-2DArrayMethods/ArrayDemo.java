public class ArrayDemo {
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

  public static int countZeros2D(int[][] nums){
    int zeroCount = 0;
    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++){
            if (nums[i][j] == 0){
                zeroCount++;
            }
        }
    }
    return zeroCount;
  }


    //3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  //this should use arrToString(int[])
  String initial = "[";
  for (int i = 0; i < ary.length; i++){
    initial += arrayToString(ary[i]);
    if (i < ary.length - 1) {
        initial += ", ";
    }
  }
  initial+="]";
  return initial;
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++) {
            sum += nums[i][j];
        }
    }
    return sum;
  //use a nested loop to solve this
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  * [2][3] -> [3][2]
  */
public static int[][] swapRC(int[][]nums){
  int numRows = nums.length;
  int numCol = nums[0].length;
  int[][] result = new int[numCol][numRows]; 
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums[i].length; j++){
        result[j][i] = nums[i][j];
      }
    }
  return result;
}

//3. Modify a given 2D array of integer as follows:
//Replace all the negative values:
//-When the row number is the same as the column number replace
//that negative with the value 1
//-All other negatives replace with 0
public static void replaceNegative(int[][] vals){ 
  for (int i = 0; i < vals.length; i++) {
    for (int j = 0; j < vals[i].length; j++) {
      if (vals[i][j] < 0) {
        if (i == j) {
          vals[i][j] = 1;
        } else {
          vals[i][j] = 0;
        }
      }
    }
  }
}

//4. Make a copy of the given 2d array.
//When testing : make sure that changing the original does NOT change the copy.
//DO NOT use any built in methods that "copy" an array.
//You SHOULD write a helper method for this.
//If you don't see a good way to do that, you should stop and look at prior methods.
public static int[] copyHelper(int[] nums) {
  int[] copy = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    copy[i] = nums[i];
  }
  return copy;
}

public static int[][] copy(int[][] nums){
  if (nums == null){
    return null;
  }
  
  int[][] copy = new int[nums.length][];
        for (int i = 0; i < nums.length; i++) {
          copy[i] = copyHelper(nums[i]);
        }

  return copy;
}


  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String start = "<table>";
    for (int i = 0; i < nums.length; i++) {
        start += "<tr>";
        for (int j = 0; j < nums[i].length; j++) {
            start += "<td>";
            start += nums[i][j];
            start += "</td>";
            if (j )
        }
    }
  }

  public static void main(String[] args){
    //testing 1d arrayToString
    int[] thing = {1,2,3,4,5};
    System.out.println(arrayToString(thing));

    //testing arrToString
    int[][] twoDThing = {{1,2}, {3,4}};
    System.out.println(arrToString(twoDThing));

    //testing arr2dSum
    System.out.println(arr2DSum(twoDThing));

    //testing swapRC
    int[][] twoD = {{1,2,3}, {4,5,6}};
    int[][] swapped = swapRC(twoD);
    System.out.println(arrToString(swapped));
  }
} 