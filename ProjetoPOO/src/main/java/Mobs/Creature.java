package Mobs;

public abstract class Creature {

    protected int HP; //pontos de vida

//    protected int stamina; //energia necessária pra atacar no combate

    public Creature(int HP) {
        this.HP = HP;
//        this.stamina = stamina;
    }
    public abstract String getCreatureType();

    public abstract int getDamage();

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }
//    public void setStamina(int stamina) {
//        this.stamina = stamina;

//    }

//    public int getStamina() {
//        return stamina;
//    }


}
