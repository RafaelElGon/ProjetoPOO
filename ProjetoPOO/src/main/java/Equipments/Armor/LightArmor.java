package Equipments.Armor;

public class LightArmor extends Armor{
    public LightArmor(String armorName, int defense, double weight) {
        super(armorName, defense, weight);
    }

    @Override
    public ArmorAttribute getArmorAttribute() {
        return ArmorAttribute.LIGHT;
    }
}
