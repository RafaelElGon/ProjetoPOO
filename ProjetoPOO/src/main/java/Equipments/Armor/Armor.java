package Equipments.Armor;

import Cards.cardType;

public abstract class Armor {
    private final String armorName;
    private static final Cards.cardType cardType = Cards.cardType.ARMOR;
    private final int defense;
    private final double weight; //in grams/kilograms

    public Armor(String armorName, int defense, double weight) {
        this.armorName = armorName;
        this.defense = defense;
        this.weight = weight;
    }

    public abstract ArmorAttribute getArmorAttribute();

    public cardType getcardType(){
        return cardType;
    }

    public String getArmorName() {
        return armorName;
    }

    public int getDefense() {
        return defense;
    }

    public double getWeight() {
        return weight;
    }
}
