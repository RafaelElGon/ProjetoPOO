package Mobs;
//TODO: ATRIBUTO DE DANO NAS OUTRAS CRIATURAS, TALVEZ TIRAR DE ELFO CASO UMA IDEIA MELHOR SURJA

public abstract class Creature {

    protected int HP; //pontos de vida

    protected int stamina; //energia necessária pra atacar no combate

    public Creature(int HP, int stamina) {
        this.HP = HP;
        this.stamina = stamina;
    }
    public abstract String getCreatureType();

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getHP() {
        return HP;
    }

    public int getStamina() {
        return stamina;
    }


}
