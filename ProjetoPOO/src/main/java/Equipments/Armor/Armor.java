package Equipments.Armor;

public abstract class Armor {
    private String armorName;
    private int defense;
    private double weight; //in grams/kilograms

    public Armor(String armorName, int defense, double weight) {
        this.armorName = armorName;
        this.defense = defense;
        this.weight = weight;
    }

    public Armor(){
        this("",
                Integer.parseInt("Defense value not informed"),
                Double.parseDouble("Weight not informed"));
    }

    public abstract ArmorAttribute getArmorAttribute();



    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
