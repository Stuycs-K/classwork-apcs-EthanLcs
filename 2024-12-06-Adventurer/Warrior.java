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
        return super.getName() + " the warrior";
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
        return getSpecialName() + "has attacked " + other.getName();
    }
    
    public String support(Adventurer other){

    }
    public String support(){

    }
    public String specialAttack(Adventurer other){
        return
    }
}
