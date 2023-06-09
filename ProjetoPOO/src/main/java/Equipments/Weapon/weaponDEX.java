package Equipments.Weapon;

public class weaponDEX extends Weapon {
    private final WeaponAttribute weaponAttribute;
    private static final String diceDamage = "1d10";

    public weaponDEX(String weaponName) {
        super(weaponName);
        this.weaponAttribute = WeaponAttribute.DEX;
    }

    public int WeaponDamage() {
        return (int) (1 + Math.random() * 10);
    } //o dano da arma é o resultado de um d10

    public String getDiceDamage() {
        return diceDamage;
    }

    @Override
    public WeaponAttribute getWeaponAttribute() {
        return weaponAttribute;
    }

    @Override
    public String getCardName() {
        return this.weaponName;
    }

    @Override
    public void setCardName(String name) {

    }
}