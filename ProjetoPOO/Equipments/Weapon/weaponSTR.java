package Equipments.Weapon;

public class weaponSTR extends Weapon {
    private final WeaponAttribute weaponAttribute;

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
    } //O dano da arma é o resultado de um d8 e um d6

    @Override
    public String getCardName() {
        return this.weaponName;
    }

    @Override
    public void setCardName(String name) {
        this.weaponName = name;
    }
}
