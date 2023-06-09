package Application;
import Application.Controllers.CDPlayController;

import javax.swing.*;
import java.awt.*;

public class CardDuelInterface extends JFrame {
    JButton play;
    JLabel card1, card2, text;
    ImageIcon shieldCard = new ImageIcon("./images/shieldCard.png");
    ImageIcon weaponCard = new ImageIcon("./images/weaponCard.png");

    public CardDuelInterface() {
        setTitle("Card Duel: The Game");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new GridLayout(2, 2));

        card1 = new JLabel(shieldCard);
        card2 = new JLabel(weaponCard);
        text = new JLabel("<html>SEJA BEM VINDO AO<br/>CARD DUEL</html>");
        text.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
        play = new JButton("PLAY");
        play.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
        play.addActionListener(new CDPlayController(this));

        getContentPane().add(new JLabel());
        getContentPane().add(text);
        getContentPane().add(new JLabel());
        getContentPane().add(card1);
        getContentPane().add(play);
        getContentPane().add(card2);
    }

    public static void main(String[] args) {
        CardDuelInterface window = new CardDuelInterface();

        window.setVisible(true);
    }
}
