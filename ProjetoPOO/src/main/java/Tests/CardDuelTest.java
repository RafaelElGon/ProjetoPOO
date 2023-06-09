package Tests;

import Application.CardDuelSystem;
import Cards.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardDuelTest {
    CardDuelSystem cds;

    @BeforeEach
    void setup(){
        this.cds = new CardDuelSystem();
    }

    @Test
    void CardDuelSystemTest(){
        Player p = new Player("Player", 0);

        assertNull(cds.getPlayer()); //setupGame() ainda não foi iniciado

        assertEquals(0, cds.getWeaponDeck().size());

        cds.setupGame();

        assertFalse(cds.getArmorDeck().isEmpty());

        assertFalse(p.getPoints() > 0);
    }

    @Test
    void CardDuelTest2(){
        cds.setupGame();

        assertEquals(20, cds.getPlayer().getHP());

        assertEquals(10, cds.getWeaponDeck().size());

    }
}
