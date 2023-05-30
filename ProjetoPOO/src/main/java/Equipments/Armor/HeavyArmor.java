package Equipments.Armor;

public class HeavyArmor extends Armor{
    private static final int defense = 10;
    private static int weight = (int) ((1 + Math.random() * 8) + (1 + Math.random() * 6));

    public HeavyArmor(String armorName) {
        super(armorName, defense, weight);
    }
    @Override
    public ArmorAttribute getArmorAttribute() {
        return ArmorAttribute.HEAVY;
    }
}
