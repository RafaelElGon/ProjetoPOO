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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//QUE DEUS TENHA PIEDADE DE MINHA ALMA

public class CardDuelSystem {
    private List<Armor> armorDeck;

    private List<Weapon> weaponDeck;

    private List<Creature> mobs;

    private Player player;

    public CardDuelSystem() {
        this.armorDeck = new ArrayList<>();
        this.weaponDeck = new ArrayList<>();
        this.mobs = new ArrayList<>();
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

    public List<Weapon> getWeaponDeck() {
        return weaponDeck;
    }

    private void setWeaponDeck(List<Weapon> weaponDeck) {
        this.weaponDeck = weaponDeck;
    }

    public boolean setupGame() {
        String playerName = JOptionPane.showInputDialog(null, "Insira seu nome: ");
        while (playerName == null) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o nome, tente novamente");
            playerName = JOptionPane.showInputDialog(null, "Insira seu nome: ");
        }
        setPlayer(new Player(playerName, 0));
        //inicia o jogo criando dois arrays, de armas e armaduras (escudos serão armaduras aqui)
        //preenchendo eles "aleatoriamente"
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
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
        for (int k = 0; k < 5; k++) {
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
            if (s.getArmorAttribute() == ArmorAttribute.HEAVY) {
                s.setCardName("Escudo Aço Reforçado");
            } else if (s.getArmorAttribute() == ArmorAttribute.MEDIUM) {
                s.setCardName("Escudo de Madeira");
            } else {
                s.setCardName("Broquél de Ferro");
            }
            this.armorDeck.add(s);
        }
        for (int i = 0; i < 1; i++) {
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
        return this.armorDeck.size() > 0 && this.weaponDeck.size() > 0;
    }

    public boolean battle() {
        //mão do jogador
        List<Armor> playerHandArmor = new ArrayList<>();
        List<Weapon> playerHandWeapon = new ArrayList<>();

        for (int u = 0; u < 4; u++) { //adicionando as cartas na mão do jogador
            playerHandArmor.add(this.armorDeck.get(u));
        }
        for (int j = 0; j < 4; j++) {
            playerHandWeapon.add(this.weaponDeck.get(j));
        }
        int turn = 0;
            for (int k = 0; k < mobs.size(); k++) {
                if (k > 0) {
                    playerHandArmor.add(this.armorDeck.get(k));
                    playerHandWeapon.add(this.weaponDeck.get(k));
                }
                while (mobs.get(k).getHP() > 0) {
                    turn++;
                    JOptionPane.showMessageDialog(null, "TURNO " + turn);

                    int creatureDamage = mobs.get(k).getDamage();
                    int creatureHP = mobs.get(k).getHP();
                    int playerDefense = playerHandArmor.get(k).getDefense();
                    int playerDamage = playerHandWeapon.get(k).WeaponDamage();

                    JOptionPane.showMessageDialog(null, ">>Inicio do Combate<<");

                    int combatDamage = creatureHP - playerDamage;
                    mobs.get(k).setHP(combatDamage);
                    JOptionPane.showMessageDialog(null,
                            "Combate:\n" + "Você inflingiu " +
                                    playerDamage + " de dano em " +
                                    mobs.get(k).getCreatureType() + "!");

                    JOptionPane.showMessageDialog(null, ">>Fim do Combate<<");

                    if (mobs.get(k).getHP() <= 0) {
                        mobs.get(k).setHP(0);
                        player.addPoints(100);
                        JOptionPane.showMessageDialog(null, "Você derrotou o inimigo! " +
                                "Você agora tem " + player.getPoints() + " pontos!");
                        JOptionPane.showMessageDialog(null,
                                "Resultados da batalha:\n" +
                                        "Pontos: " + player.getPoints() +
                                        "\nArma utilizada: " + playerHandWeapon.get(k).getCardName() +
                                        "\nDano da arma: " + "'" + playerHandWeapon.get(k).getDiceDamage() + "'"
                                        + " " + " -> " + playerHandWeapon.get(k).WeaponDamage());
                        continue;
                    }

                    JOptionPane.showMessageDialog(null,
                            "Resultados da batalha:\n" +
                                    "Arma utilizada: " + playerHandWeapon.get(k).getCardName() +
                                    "\nDano da arma: " + "'" + playerHandWeapon.get(k).getDiceDamage() + "'"
                                    + " -> " + playerHandWeapon.get(k).WeaponDamage() +
                                    "\nCriatura: " + mobs.get(k).getCreatureType() +
                                    "\nVida restante  -> " + creatureHP);
                    JOptionPane.showMessageDialog(null, ">>Turno do Inimigo<<");

                    if (playerDefense < creatureDamage) {
                        int combatDefense = creatureDamage - playerDefense;
                        JOptionPane.showMessageDialog(null,
                                "Defesa:\n" + mobs.get(k).getCreatureType() + " inflingiu " +
                                        creatureDamage + " de dano em você!");

                        player.setHP(player.getHP() - combatDefense);
                    } else {
                        player.addPoints(50);
                        JOptionPane.showMessageDialog(null, "Defendeu todo o dano!");
                    }
                    JOptionPane.showMessageDialog(null, ">>Fim do Turno do Inimigo<<");
                    JOptionPane.showMessageDialog(null,
                            "Resultados da batalha:" +
                                    "\nItem de defesa utilizado: " + playerHandArmor.get(k).getCardName() +
                                    "\nDefesa: " + playerHandArmor.get(k).getDefense() +
                                    "\nHP do jogador  -> " + player.getHP() + "/20" +
                                    "\nCriatura: " + mobs.get(k).getCreatureType() +
                                    "\nDano de " + mobs.get(k).getCreatureType() + " -> " + mobs.get(k).getDamage());
                }
            }
        if (player.getHP() <= 0) {
            player.minusPoints(500);
            System.out.println("Você perdeu! Os inimigos foram muito fortes...");
            return false;
        }
        System.out.println("Parabéns! Você ganhou!");
        player.addPoints(500);
        return true;
    }

    public boolean saveData(Player p) {
        CardDuelSaves cdSaves = new CardDuelSaves();
        try {
            cdSaves.saveScore(p);
            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        CardDuelSystem cds = new CardDuelSystem();
        cds.setupGame();
        cds.battle();

//        for (Armor armor : cds.getArmorDeck()) {
//            System.out.println(armor.getCardName());
//        }
//        for (Weapon w : cds.getWeaponDeck()) {
//            System.out.println(w.getCardName());
//        }
    }
}