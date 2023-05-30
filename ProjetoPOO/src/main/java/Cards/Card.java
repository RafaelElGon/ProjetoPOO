package Cards;

public class Card {
    private String name;
    private cardType cardType;
    private Color color;
    private int manaCost;
    private String cardEffects;

    public Card(String cardName, cardType cardType, Color color ,int manaCost, String cardEffects) {
        this.name = cardName;
        this.cardType = cardType;
        this.color = color;
        this.manaCost = manaCost;
        this.cardEffects = cardEffects;
    }

    public Card(){
        this("Cards.Card name not informed", null, null,
                Integer.parseInt(("No mana cost informed")), "Cards.Card effects not informed");
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getCardEffects() {
        return cardEffects;
    }

    public void setCardEffects(String cardEffects) {
        this.cardEffects = cardEffects;
    }
}
