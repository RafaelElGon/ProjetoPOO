package Equipments.Weapon;

import Cards.Card;
import Cards.cardType;

public abstract class Weapon extends Card {
    private static final Cards.cardType cardType = Cards.cardType.WEAPON;

    public Weapon(String weaponName){
        super(weaponName, cardType);
    }
    public cardType getCardType(){
        return cardType;
    }
    public abstract WeaponAttribute getWeaponAttribute();

    public abstract int WeaponDamage();
}
