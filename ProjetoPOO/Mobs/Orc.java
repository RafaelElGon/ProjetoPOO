package Mobs;

public class Orc extends Creature {
    private static final String creatureType = "Orc";

    private int damage = (int)(1 * Math.random() * 12);

    public Orc(){
        super(15, 6);
    }
    public int getDamage(){
        return this.damage;
    }

    @Override
    public String getCreatureType() {
        return creatureType;
    }
}
