package Application;

import Cards.Player;
import Equipments.Armor.Armor;
import Equipments.Armor.ArmorAttribute;
import Equipments.Armor.Shield;
import Equipments.Weapon.Weapon;
import Equipments.Weapon.weaponDEX;
import Equipments.Weapon.weaponMDR;
import Equipments.Weapon.weaponSTR;
import Mobs.Creature;
import Mobs.Elf;
import Mobs.Human;
import Mobs.Orc;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//QUE DEUS TENHA PIEDADE DE MINHA ALMA

public class CardDuelSystem {
    private List<Armor> armorDeck;

    private List<Weapon> weaponDeck;

    private List<Creature> mobs;

    private Player player;

    public CardDuelSystem(Player player) {
        this.armorDeck = new ArrayList<>();
        this.weaponDeck = new ArrayList<>();
        this.mobs = new ArrayList<>();
        this.player = player;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player p) {
        this.player = p;
    }

    public List<Creature> getMobs() {
        return this.mobs;
    }

    private void setMobs(List<Creature> mobs) {
        this.mobs = mobs;
    }

    public List<Armor> getArmorDeck() {
        return armorDeck;
    }

    private void setArmorDeck(List<Armor> armorDeck) {
        this.armorDeck = armorDeck;
    }

    private List<Weapon> getWeaponDeck() {
        return weaponDeck;
    }

    private void setWeaponDeck(List<Weapon> weaponDeck) {
        this.weaponDeck = weaponDeck;
    }

    public void setupGame() {
        //inicia o jogo criando dois arrays, de armas e armaduras (escudos serão armaduras aqui)
        //preenchendo eles "aleatoriamente"
        Random r = new Random();

        for (int i = 0; i < 2; i++) {
            int randomNumber = r.nextInt(30 - 1 + 1) + 1; //número aleatorio entre 1 e 30
            if (randomNumber <= 9) {
                Weapon w = new weaponDEX("Adaga");
                this.weaponDeck.add(w);
            } else if (randomNumber <= 19) {
                Weapon w = new weaponMDR("Espada");
                this.weaponDeck.add(w);
            } else {
                Weapon w = new weaponSTR("Clava");
                this.weaponDeck.add(w);
            }
        }
        for (int k = 0; k < 2; k++) {
            Armor a = new Armor("");
            if (a.getArmorAttribute() == ArmorAttribute.HEAVY) {
                a.setCardName("Armadura de Placas");
            } else if (a.getArmorAttribute() == ArmorAttribute.MEDIUM) {
                a.setCardName("Armadura de Couro");
            } else {
                a.setCardName("Robes do Mago");
            }
            this.armorDeck.add(a);

            Armor s = new Shield("");
            for (int j = 0; j < 2; j++) {
                if (s.getArmorAttribute() == ArmorAttribute.HEAVY) {
                    s.setCardName("Escudo Aço Reforçado");
                } else if (s.getArmorAttribute() == ArmorAttribute.MEDIUM) {
                    s.setCardName("Escudo de Madeira");
                } else {
                    s.setCardName("Broquél de Ferro");
                }
                this.armorDeck.add(s);
            }
        }
        for (int i = 0; i < 4; i++) {
            int randomNumber1 = r.nextInt(60 - 1 + 1) + 1;
            if (randomNumber1 <= 19) {
                Creature c = new Elf();
                this.mobs.add(c);
            } else if (randomNumber1 <= 39) {
                Creature c = new Orc();
                this.mobs.add(c);
            } else {
                Creature c = new Human();
                this.mobs.add(c);
            }
        }
    }

    public String battle() {
        //mão do jogador
        List<Armor> playerHandArmor = new ArrayList<>();
        List<Weapon> playerHandWeapon = new ArrayList<>();

        for (int u = 0; u < 2; u++) { //adicionando as cartas na mão do jogador
            playerHandArmor.add(this.armorDeck.get(u));
        }
        for (int j = 0; j < 2; j++) {
            playerHandWeapon.add(this.weaponDeck.get(j));
        }

        while (player.getHP() != 0) {
            while (mobs.size() != 0) {
                for (int k = 0; k < mobs.size(); k++) {
                    while (mobs.get(k).getHP() > 0) {

                        int creatureDamage = mobs.get(k).getDamage();
                        int creatureHP = mobs.get(k).getHP();
                        int playerDefense = playerHandArmor.get(k).getDefense();
                        int playerDamage = playerHandWeapon.get(k).WeaponDamage();

                        int combatDamage = creatureHP - playerDamage;
                        mobs.get(k).setHP(combatDamage);
                        JOptionPane.showMessageDialog(null,
                                "Combate:\n" + player.getName() + " inflingiu " +
                                        playerHandWeapon.get(k).WeaponDamage() + " de dano em " +
                                        mobs.get(k).getCreatureType());

                        if(creatureHP <= 0){
                            JOptionPane.showMessageDialog(null,
                                    "Resultados da batalha:\n" +
                                            "Arma utilizada: " + playerHandWeapon.get(k).getCardName() +
                                            "\nDano da arma: " + playerHandWeapon.get(k).WeaponDamage() +
                                            "\nCriatura: " + mobs.get(k).getCreatureType() +
                                            "\nVida restante em " + mobs.get(k).getCreatureType() +
                                            " -> " + mobs.get(k).getHP());
                            continue;
                        }
                        JOptionPane.showMessageDialog(null,
                                "Resultados da batalha:\n" +
                                        "Arma utilizada: " + playerHandWeapon.get(k).getCardName() +
                                        "\nDano da arma: " + playerHandWeapon.get(k).WeaponDamage() +
                                        "\nCriatura: " + mobs.get(k).getCreatureType() +
                                        "\nVida restante em " + mobs.get(k).getCreatureType() +
                                        " -> " + mobs.get(k).getHP());

                        if (playerDefense < creatureDamage) {
                            int combatDefense = creatureDamage - playerDefense;
                            JOptionPane.showMessageDialog(null,
                                    "Defesa:\n" + mobs.get(k).getCreatureType() + " inflingiu " +
                                            creatureDamage + " de dano em " + player.getName());

                            player.setHP(player.getHP() - combatDefense);
                        }

                        JOptionPane.showMessageDialog(null,
                                "Resultados da batalha:\n" +
                                        "" +
                                        "\nItem de defesa utilizado: " + playerHandArmor.get(k).getCardName() +
                                        "\nDefesa: " + playerHandArmor.get(k).getDefense() +
                                        "\nHP do jogador " + player.getName() + " -> " + player.getHP() + "/30" +
                                        "\nCriatura: " + mobs.get(k).getCreatureType() +
                                        "\nDano de " + mobs.get(k).getCreatureType() + " -> " + mobs.get(k).getDamage());
                    }
                }
            }

            if (player.getHP() <= 0) {
                return "Você perdeu! Os inimigos foram muito fortes...";
            }
        }
        return "Parabéns! Você ganhou!";
    }

    public static void main(String[] args) {
        Player p = new Player();
        CardDuelSystem cds = new CardDuelSystem(p);
        cds.setupGame();
        System.out.println(cds.battle());

//        for (Armor armor : cds.getArmorDeck()) {
//            System.out.println(armor.getCardName());
//        }
//        for (Weapon w : cds.getWeaponDeck()) {
//            System.out.println(w.getCardName());
//        }
    }
}
