public class makewords{
  public static Arraylist<String> mw(int remaining, String partial, String alphabet, ArrayList<String> words){
    if (remaining == 0){
      words.add(partial);
    }
    else {
      for (int i = 0; i < words.size(); i++){
        return makeWords(remaining - 1,partial + alphabet.substring(1), alphabet.substring(1), words);
      }
    }
  }
}
