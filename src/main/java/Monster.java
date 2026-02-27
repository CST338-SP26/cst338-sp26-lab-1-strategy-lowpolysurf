import java.util.HashMap;

public abstract class Monster {
    private int hp;
    private int xp = 10;
    private int maxHp;
    private HashMap<String, Integer> items;

    public Monster(int xp, int maxHp, HashMap<String,Integer> items){
        this.xp = xp;
        this.maxHp = maxHp;
        this.hp = this.maxHp;
        this.items = items;
    }
    //non-param constructor
    public Monster(){
        this.hp = 0;
        this.maxHp = 0;
        this.items = new HashMap<String, Integer>();
    }

    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public int getXp(){
        return this.xp;
    }
    public HashMap<String, Integer> getItems(){
        return this.items;
    }
    public void setItems(HashMap<String, Integer> items){
        this.items = items;
    }
    public int getMaxHp(){
        return this.maxHp;
    }

    public boolean equals(Monster comp){
        if(this.hp == comp.hp && this.xp == comp.xp && this.maxHp == comp.maxHp && this.items.equals(comp.items)){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return 0;
    }
    @Override
    public String toString(){
        return "";
    }
}
