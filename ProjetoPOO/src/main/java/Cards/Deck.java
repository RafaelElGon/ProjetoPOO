package Cards;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> library;
    private DeckStrat deckStrategy;
    private Color deckColor;

    public Deck(DeckStrat deckStrategy, Color deckColor) {
        this.library = new ArrayList<>();
        this.deckStrategy = deckStrategy;
        this.deckColor = deckColor;
    }

    public Deck() {
        this(null, null);
    }

    public List<Card> getLibrary() {
        return library;
    }

    public void setLibrary(List<Card> library) {
        this.library = library;
    }

    public DeckStrat getDeckStrategy() {
        return deckStrategy;
    }

    public void setDeckStrategy(DeckStrat deckStrategy) {
        this.deckStrategy = deckStrategy;
    }

    public Color getDeckColor() {
        return deckColor;
    }

    public void setDeckColor(Color deckColor) {
        this.deckColor = deckColor;
    }
}
