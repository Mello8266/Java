package uec;
public class Luta {
    private String desafiado;
    private String desafiante;
    private int rounds;
    private boolean aprovado;

    public void marcarLuta(){

    }
    public void lutar(){
        
    }

    // Métodos especiais
    //! Setters
    public void setDesafiado(String desafiado) {
        this.desafiado = desafiado;
    }
    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    //! GETTERS
    public String getDesafiado() {
        return this.desafiado;
    }
    public String getDesafiante() {
        return this.desafiante;
    }
    public int getRounds() {
        return this.rounds;
    }
    public boolean isAprovado() {
        return this.aprovado;
    }
}