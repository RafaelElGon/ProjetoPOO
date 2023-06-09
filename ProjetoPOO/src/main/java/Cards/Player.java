package Cards;

public class Player {
    private String name;

    private int points;

    //    private int actionPoints;

    private int HP = 20; //TODO: VERIFICAR SE ESSE VALOR É BALANCEADO

    public Player(String name, int points) {
        this.name = name;
        this.points = 0;
    }

    public Player() {
        this("No name informed", 0);
    }

    public String getName() {
        return name;
    }
    public int getHP(){
        return HP;
    }
    public void setHP(int HP){
        this.HP = HP;
    }

    public int getPoints(){
        return this.points;
    }

    public void addPoints(int points){
        this.points += points;
    }
    public void minusPoints(int points){
        this.points -= points;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public int getActionPoints() {
//        return actionPoints;
//    }
//
//    public void setActionPoints(int actionPoints) {
//        this.actionPoints = actionPoints;

//    }
}
