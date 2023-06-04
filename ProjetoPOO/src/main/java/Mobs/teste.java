package Mobs;

import Equipments.Armor.Armor;
import Equipments.Armor.Shield;
import Equipments.Weapon.Weapon;
import Equipments.Weapon.weaponDEX;
import Equipments.Weapon.weaponSTR;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class teste {
    public static void main(String[] args) {

        Creature e = new Elf();
        System.out.println(e.getHP());
        e.setHP(4);
        System.out.println(e.getHP());
        System.out.println(e.getClass());

//        Creature g = new Orc();
//        System.out.println(g.getHP());
//        g.setHP(2);
//        Armor s = new Shield("aaaa");
//        System.out.println(s.getCardName());
//        System.out.println(s.getDefense());
//        Armor a = new Armor("armadura");
//        System.out.println(a.getCardName());
//        Weapon w = new weaponSTR("arma teste");
//        System.out.println(w.getCardName());
//        System.out.println(a.getDefense());
//        System.out.println(a.getcardType());
//        System.out.println(s.getWeight());
//        System.out.println(s.getArmorAttribute());
//        System.out.println(s.getcardType());
//        Player p = new Player();
//        System.out.println(g.getHP());
//        System.out.println(a.getWeight());
//        System.out.println(a.getArmorAttribute());
//        System.out.println(h.getHP());
//        h.setHP(4);
//        System.out.println(h.getHP());
    }
}
