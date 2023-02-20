package dz1;

public class fermer extends character {

        int feed;
        int cartridges;
    
        public fermer(String name, int hp, int attack) {
            super(name, hp, attack);
    
        }
        public int getCartridges() {
            return 10;
        }
        public int getFeed() {
            return 0;
        }
    
    }
