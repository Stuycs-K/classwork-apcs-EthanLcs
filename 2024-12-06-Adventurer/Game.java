import java.io.*;
import java.util.*;

public class Game{
  Adventurer p1 = new CodeWarrior("joe", 100, "Java");
  Adventurer p2 = new CodeWarrior("bobby", 50, "python");

  public static void main(String[] args){
    System.out.println(p1.getName() + p1.getHP());
    System.out.println(p2.getName() + p2.getHP());

    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    //Read one line of user input
    String userName = userInput.nextLine();
    if (userInput.equals("attack")){
      p1.attack(p2);
    }
    else if (userInput.equals("special")){
      p1.specialAttack(p2);
    }
    else if (userInput.equals("support")){
      p1.support(p2);
    }
    else if (userInput.equals("quit")){
      return;
    }
    else {
      System.out.println("type a valid response");
    }
    //Do something with the input

  }

}
