package Cards;

public class Player {
    private String name;
    private static final int HP = 30; //TODO: VERIFICAR SE ESSE VALOR É BALANCEADO

    public Player(String name) {
        this.name = name;
    }

    public Player() {
        this("No name informed");
    }

    public String getName() {
        return name;
    }
    public int getHP(){
        return HP;
    }

    public void setName(String name) {
        this.name = name;
    }
}
