public class mw{
  public static void makeWords(int remainingLetters, String partial, String alphabet){
    if (remainingLetters == 0){
      System.out.println(partial);
      return;
    }

      for (int i = 0; i < alphabet.length(); i++){
        makeWords(remainingLetters - 1,partial + alphabet.charAt(i), alphabet);
      }
  }
}


