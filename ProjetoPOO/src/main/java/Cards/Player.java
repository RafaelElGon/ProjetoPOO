package Cards;

public class Player {
    private String name;
    private Deck playerDeck;
    private int hp;

    public Player(String name, Deck playerDeck, int hp) {
        this.name = name;
        this.playerDeck = playerDeck;
        this.hp = hp;
    }

    public Player() {
        this("No name informed", null,
                Integer.parseInt("HP not informed"));
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deck getPlayerDeck() {
        return playerDeck;
    }

    public void setPlayerDeck(Deck playerDeck) {
        this.playerDeck = playerDeck;
    }
}
