package Equipments.Weapon;

public class weaponSTR extends Weapon {
    private WeaponAttribute weaponAttribute;

    private static final String weaponDice = "1d8 + 1d6";

    @Override
    public WeaponAttribute getWeaponAttribute() {
        return weaponAttribute;
    }

    public String getWeaponDice(){
        return weaponDice;
    }


    public weaponSTR(String weaponType) {
        super(weaponType);
        this.weaponAttribute = WeaponAttribute.STR;
    }

    public int WeaponDamage() {
        return (int) ((1 + Math.random() * 8) + (1 + Math.random() * 6));
    } //The weapon damage is the result of an 8 and 6 sided dice roll
}
