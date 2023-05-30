package Equipments.Armor;

public class MediumArmor extends Armor{
    private static final int defense = 10;
    private static int weight = (int) (1 + Math.random() * 10);
    public MediumArmor(String armorName){
        super(armorName, defense, weight);
    }
    @Override
    public ArmorAttribute getArmorAttribute() {
        return ArmorAttribute.MEDIUM;
    }
}
