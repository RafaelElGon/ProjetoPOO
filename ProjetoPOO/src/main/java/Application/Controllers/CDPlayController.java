package Application.Controllers;

import Application.CardDuelSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CDPlayController implements ActionListener {
    private CardDuelSystem cds = new CardDuelSystem();
    private JFrame primaryWindow;


    public CDPlayController(JFrame primaryWindow) {
        this.primaryWindow = primaryWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(primaryWindow, "Se prepare para o duelo!");

        cds.setupGame();
        cds.battle();

        if(cds.battle()){
            int confirmDialog = JOptionPane.showConfirmDialog(primaryWindow,"Deseja salvar sua pontuação?");

            if(confirmDialog == JOptionPane.YES_OPTION) {
                if(cds.saveData(cds.getPlayer())){
                    System.out.println("Pontos salvos");
                }
            }
        }
    }
}
