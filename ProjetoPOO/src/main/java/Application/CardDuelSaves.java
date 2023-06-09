package Application;

import Cards.Player;

import java.io.*;
import java.util.Map;

public class CardDuelSaves {
    private String File;

    public CardDuelSaves(String playerSaves) {
        this.File = playerSaves;
    }

    public CardDuelSaves() {
        this("Save-Files.txt");
    }

    public void saveScore(Player p) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.File))) {
            String playerInfo = p.getName() + ", " + p.getPoints();
            bw.write(playerInfo + "\n-----------------------------");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar");
        }
    }

    public Player loadSaveFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(this.File))) {
            String playerScores;
            playerScores = br.readLine();

            if (playerScores != null) {
                String[] playerData = playerScores.split(", ");
                if (playerData.length == 2) {
                    String playerName = playerData[0];
                    int PlayerScore = Integer.parseInt(playerData[1]);
                    return new Player(playerName, PlayerScore);
                }
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao tentar ler os dados do jogador");
        }
        return null;
    }
}