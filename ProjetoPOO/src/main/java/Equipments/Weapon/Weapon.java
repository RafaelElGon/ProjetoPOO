package Equipments.Weapon;

import Cards.Card;
import Cards.cardType;

public abstract class Weapon implements Card {
    protected String weaponName;
    private static final Cards.cardType cardType = Cards.cardType.WEAPON;

    public Weapon(String weaponName){
        this.weaponName = weaponName;
    }
    public cardType getCardType(){
        return cardType;
    }
    public abstract WeaponAttribute getWeaponAttribute();

    public abstract int WeaponDamage();

    public abstract String getDiceDamage();
}
