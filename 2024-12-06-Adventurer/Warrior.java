public class Warrior extends Adventurer {
    private String resource;
    private int special;

    public Warrior(String name){
        super(name);
    }

    public Warrior(String name, int hp){
        super(name, hp);
    }

    public String getSpecialName(){
        this.resource = "mana";
        return resource;
    }

    public int getSpecial(){
        return special;
    }
    public void setSpecial(int n){
        this.special = n;
    }
    public int getSpecialMax(){
        return 100;
    }

    public String attack(Adventurer other){
        int n = other.getHP() - 5;
        other.setHP(n);
        return getName() + "has attacked " + other.getName();
    }
    
    public String support(Adventurer other){
        int n = other.getHP() + 5;
        other.setHP(n);
        return getName() + "has supported " + other.getName();
    }
    public String support(){
        int n = getHP() + 5;
        this.setHP(n); 
        return getName() + " new hp is " + this.getHP();
     }
    public String specialAttack(Adventurer other){
        return getName() + " has used " + getSpecial() + 
        " and hurt the "  + other.getName();
    }
}
