package Mobs;

public class Human extends Creature{
    private static final String creatureType = "Human";

    private int damage = (int)(1 + Math.random() * 10);

    public Human() {
        super(12, 8);
    }

    public int getDamage() {
        return this.damage;
    }

    @Override
    public String getCreatureType() {
        return creatureType;
    }
}
