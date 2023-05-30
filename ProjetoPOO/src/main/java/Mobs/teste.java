package Mobs;

import Equipments.Armor.Armor;
import Equipments.Armor.HeavyArmor;

public class teste {
    public static void main(String[] args) {
        Creature h = new Human();
        Armor a = new HeavyArmor("aaaa");
        System.out.println(a.getWeight());
//        System.out.println(h.getHP());
    }
}
