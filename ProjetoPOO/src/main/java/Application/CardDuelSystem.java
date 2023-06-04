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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TODO: SISTEMA USANDO JOPTION PANE, E DEPOIS USANDO JFRAME
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

    public Player getPlayer(){
        return this.player;
    }

    public void setPlayer(Player p){
        this.player = p;
    }

    public List<Creature> getMobs(){
        return this.mobs;
    }

    private void setMobs(List<Creature> mobs){
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

        for (int i = 0; i < r.nextInt(4 - 1 + 1) + 1; i++) {
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
        for (int k = 0; k < r.nextInt(4 - 1 + 1) + 1; k++) {
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
            for (int j = 0; j < r.nextInt(4 - 1 + 1) + 1; j++) {
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
    }

    public void setupBattle() {
        //cria o conjunto de inimigos para enfrentar;
        //a quantidade de inimigos e que tipo de inimigo é gerado "aleatoriamente"

        Random r = new Random();
        int randomNumber = r.nextInt(6 - 1 + 1) + 1;

        for (int i = 0; i < randomNumber; i++) {
            int randomNumber1 = r.nextInt(60 - 1 + 1) + 1;
            if (randomNumber1 <= 20) {
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

    public static void main(String[] args) {
        Player p = new Player();
        CardDuelSystem cds = new CardDuelSystem(p);
        cds.setupGame();
        cds.setupBattle();

        for (Armor armor : cds.getArmorDeck()) {
            System.out.println(armor.getCardName());
        }
        for (Weapon w : cds.getWeaponDeck()) {
            System.out.println(w.getCardName());
        }
    }

}