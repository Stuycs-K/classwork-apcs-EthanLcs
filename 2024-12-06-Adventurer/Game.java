import java.util.*;

public class Game{
  static Adventurer p1 = new CodeWarrior("joe", 100, "Java");
  static Adventurer p2 = new CodeWarrior("bobby", 50, "python");

  public static void main(String[] args){
    System.out.println(p1.getName() + p1.getHP());
    System.out.println(p2.getName() + p2.getHP());

    Scanner userInput = new Scanner(System.in);
    Random random = new Random();
    //You can do the rest many times:
  while (p1.getHP() > 0 && p2.getHP() > 0){
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    //Read one line of user input
    String userInputt = userInput.nextLine();
    if (userInputt.equals("attack")){
      p1.attack(p2);
    }
    else if (userInputt.equals("special")){
      p1.specialAttack(p2);
    }
    else if (userInputt.equals("support")){
      p1.support(p2);
    }
    else if (userInputt.equals("quit")){
      return;
    }
    else {
      System.out.println("type a valid response");
      continue;
    }
    if(p2.getHP() > 0){
      int opponent = random.nextInt(3);
      if (opponent == 1){
        p2.attack(p1);
        System.out.println("you got attacked");
      }
      else if (opponent == 2){
        p2.specialAttack(p1);
        System.out.println("you got special attacked");
      }
      else if (opponent == 3){
        p2.support(p1);
      }
    }
    //Do something with the input
  }
  userInput.close();
  
    if (p1.getHP() > p2.getHP()){
      System.out.println("you have won");
    }
    else {
      System.out.println("you have lost");
    }
  }
}