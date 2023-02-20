package dz1;
import dz1.character;
public class sniper extends character {
    int accuracy = 5;
    int cartridges = 5;
    int disguise = 20;

    public sniper(String name, int hp, int attack) {
        super(name, hp, attack);
    }
    @Override
    public int getAttack() {
        return 15;
    }
}
    
