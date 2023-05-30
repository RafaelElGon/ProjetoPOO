package Mobs;

import Cards.cardType;

public abstract class Creature {
//    private static final cardType cardType = Cards.cardType.CREATURE;
    private final int HP; //health points
    private final int stamina; //energy necessary for attacks in combat

    public Creature(int HP, int stamina) {
        this.HP = HP;
        this.stamina = stamina;
    }
//    public cardType getCardType(){
//        return cardType;
//    }

    public int getHP() {
        return HP;
    }

    public int getStamina() {
        return stamina;
    }


}
