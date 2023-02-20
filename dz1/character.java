package dz1;

public class character {
    protected String name;
    protected int hp;
    protected int attack;



    public character(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;


    }
    public int getAttack(){
        return 0;
    }

    public int getHp(){
        return 0;
    }
}