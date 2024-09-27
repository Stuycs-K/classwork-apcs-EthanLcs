public class myArrays.java {
  public static int[] returnCopy (int[] ary){
    int[] thing = new int[ary.length]
    for (int i = 0; i < ary.length; i++){
      thing[i] = ary[i];
    }
    return thing;
  }
  public static int concatArray(int[] ary1, int[] ary2){
    int sumLength = ary1.length + ary2.length;
    int[] arr = new int[length];
    for (int i = 0; i < ary1.length; i++){
      arr[i] = ary1[i];
    }
    for (int i = ary1.length; i < ary2.length; i++){
      arr[i] = ary2[i];
    }
    return arr;
  }
  public static void main(String[] args){
  }
  public static arrayToString(int[] nums){
    String[] ary = new String[nums.length]
    for (int i = 0; i < nums.length; i++){
      ary[i] = "" + nums[i];
    }
  }
  return ary;
}
