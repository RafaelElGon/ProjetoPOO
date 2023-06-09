package Mobs;

public class Elf extends Creature{
    private int damage = (int)(1 + Math.random() * 8);
    private static final String creatureType = "Elf";

    public Elf() {
        super(8);
    }
    public int getDamage() {
        return this.damage;
    }

    public String getCreatureType(){
        return creatureType;
    }
}
