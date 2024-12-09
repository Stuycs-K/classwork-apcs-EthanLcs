public class Game{
  Adventurer p1 = new CodeWarrior("joe", 100, "Java");
  Adventurer p2 = new Codewarrior("bobby", 50, "python");

  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);

  }

}
