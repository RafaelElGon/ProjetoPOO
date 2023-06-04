package Equipments.Weapon;

public class weaponDEX extends Weapon {
    private WeaponAttribute weaponAttribute;
    private static final String diceDamage = "1d10";

    public weaponDEX(String weaponName) {
        super(weaponName);
        this.weaponAttribute = WeaponAttribute.DEX;
    }

    public int WeaponDamage() {
        return (int) (1 + Math.random() * 10);
    } //The weapon damage is the result of a 10 sided dice roll

    public String getDiceDamage() {
        return diceDamage;
    }

    @Override
    public WeaponAttribute getWeaponAttribute() {
        return weaponAttribute;
    }
}