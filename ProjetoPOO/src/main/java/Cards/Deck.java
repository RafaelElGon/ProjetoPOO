package Cards;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> library;

    public Deck() {
        this.library = new ArrayList<>();
    }

    public List<Card> getLibrary() {
        return library;
    }

    public void setLibrary(List<Card> library) {
        this.library = library;
    }
}
