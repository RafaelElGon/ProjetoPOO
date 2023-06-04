package Equipments.Weapon;

public class weaponMDR extends Weapon{
    private WeaponAttribute weaponAttribute;

    private static final String diceDamage = "1d12";

    public weaponMDR(String weaponName) {
        super(weaponName);
        this.weaponAttribute = WeaponAttribute.MDR;
    }

    public int WeaponDamage() {
        return (int)(1 + Math.random() * 12);
    } //The weapon damage is the result of a 12 sided dice roll

    public String getDiceDamage(){
        return diceDamage;
    }

    @Override
    public WeaponAttribute getWeaponAttribute() {
        return weaponAttribute;
    }
}
