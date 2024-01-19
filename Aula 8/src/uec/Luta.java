package uec;
import java.util.Random;
public class Luta{
    //? Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds; 
    private boolean aprovado;

    //? Métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2){
            setAprovado(true);
            setDesafiado(l1);
            setDesafiante(l2);
        } else {
            setAprovado(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }
    public void lutar(){
        if (isAprovado()){
            desafiado.apresentar();
            desafiante.apresentar();
            System.out.println();
            System.out.println("===== Apresentando a luta entre " + this.desafiante.getNome() 
            + " VERSUS " + this.desafiado.getNome() + " =====");
            System.out.print("E A LUTA TERMINA EM ");
            Random vencedor = new Random();
            switch (vencedor.nextInt(0, 2)){
                case 0:
                    System.out.println("EMPATE");
                    this.desafiado.empate();
                    this.desafiante.empate();
                    break;
                case 1:
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("---------------------------------------------");
        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }

    //! Métodos especiais
    //* SETTERS
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    //* GETTERS
    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }
}