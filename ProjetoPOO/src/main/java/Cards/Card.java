package Cards;

public class Card {
    private String name;
    private cardType cardType;
    private int manaCost;
    private String cardEffects;

    public Card(String cardName, cardType cardType,int manaCost, String cardEffects) {
        this.name = cardName;
        this.cardType = cardType;
        this.manaCost = manaCost;
        this.cardEffects = cardEffects;
    }

    public Card(){
        this("Card name not informed", null,
                Integer.parseInt(("No mana cost informed")), "Card effects not informed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public cardType getCardType() {
        return cardType;
    }

    public void setCardType(cardType cardType) {
        this.cardType = cardType;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public String getCardEffects() {
        return cardEffects;
    }

    public void setCardEffects(String cardEffects) {
        this.cardEffects = cardEffects;
    }
}
