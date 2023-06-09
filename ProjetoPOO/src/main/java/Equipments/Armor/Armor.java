package Equipments.Armor;

import Cards.Card;
import Cards.cardType;

public class Armor implements Card {
    private String armorName;
    protected int defense;
    private int weight = (int) (1 + Math.random() * 12); //in kilograms
    private static final cardType cardType = Cards.cardType.ARMOR;

    public Armor(String armorName) {
        this.armorName = armorName;
        if(this.weight >= 10){
            this.defense = 10;
        } else if(this.weight >= 4){
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
    }// muda o atributo da armadura baseado no peso

    public int getDefense(){
        return this.defense;
    }
    public int getWeight(){
        return this.weight;
    }

    @Override
    public String getCardName() {
        return this.armorName;
    }

    @Override
    public cardType getCardType() {
        return cardType;
    }

    @Override
    public void setCardName(String name) {
        this.armorName = name;
    }
}