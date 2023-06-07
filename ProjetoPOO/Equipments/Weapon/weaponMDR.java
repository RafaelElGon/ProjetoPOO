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
    } //O dano da arma é o resultado de um d12

    public String getDiceDamage(){
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
        this.weaponName = name;
    }
}
