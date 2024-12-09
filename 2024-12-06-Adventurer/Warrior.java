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
        super.getName();
    }

    public int getSpecial(){

    }
    public void setSpecial(int n){
        this.special = n;
    }
    public int getSpecialMax(){
        return 100;
    }

    public String attack(Adventurer other){

    }
    
    public String support(Adventurer other){

    }
    public String support(){

    }
    public String specialAttack(Adventurer other){
        System.out.println()
    }
}
