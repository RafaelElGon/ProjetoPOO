package Equipments.Armor;

import Cards.Card;
import Cards.cardType;

public class Armor extends Card {
    protected int defense;
    private double weight = (int) (1 + Math.random() * 12); //in kilograms
    private static final cardType cardType = Cards.cardType.ARMOR;

    public Armor(String armorName) {
        super(armorName, cardType);
        if(this.weight >= 10){
            this.defense = 10;
        } else if(this.weight >= 4 && this.weight < 10){
            this.defense = 6;
        } else {
            this.defense = 4;
        }
    }
    public ArmorAttribute getArmorAttribute() {
        if(this.weight >= 9){
            return ArmorAttribute.HEAVY;
        } else if( this.weight >= 6){
            return ArmorAttribute.MEDIUM;
        }
        return ArmorAttribute.LIGHT;
    }// changes the armor attribute based on its weight


    public int getDefense(){
        return this.defense;
    }
    public double getWeight(){
        return this.weight;
    }

    public cardType getcardType(){
        return cardType;
    }
}