package Equipments.Armor;

public class Shield extends Armor {
    private int weight = (int) (1 + Math.random() * 12);

    public Shield(String shieldName) {
        super(shieldName);
        if(this.weight >= 10){
            defense = 10;
        } else if(this.weight >= 4){
            defense = 6;
        } else {
            defense = 4;
        }
    }
    @Override
    public ArmorAttribute getArmorAttribute() {
        if(this.weight >= 9){
            return ArmorAttribute.HEAVY;
        } else if(this.weight >= 6){
            return ArmorAttribute.MEDIUM;
        }
        return ArmorAttribute.LIGHT;
    }// muda o atributo do escudo baseado no seu peso
}
