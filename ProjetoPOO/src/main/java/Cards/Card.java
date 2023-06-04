package Cards;

public class Card {
    private String name;
    private cardType cardType;

    public Card(String cardName, cardType cardType) {
        this.name = cardName;
        this.cardType = cardType;
    }

    public Card(){
        this("Card name not informed", null);
    }

    public String getCardName() {
        return name;
    }
    public Cards.cardType getCardType() {
        return cardType;
    }

    public void setCardName(String name) {
        this.name = name;
    }

    private void setCardType(cardType cardType) {
        this.cardType = cardType;
    }
}
