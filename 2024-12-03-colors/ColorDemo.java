public class ColorDemo{
  public static final String Red = "\u001b[31m";
  public static final String randomRGB = "\u001b[38;2;255;0;255m";

  public static void main(String[] args){
    System.out.print(Red);
    System.out.println("this is red");
    System.out.print(randomRGB);
    System.out.println("I made purple through rgb");
  }
}
