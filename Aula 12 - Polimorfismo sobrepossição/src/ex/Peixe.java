package ex;

public class Peixe extends Animal {
    // Atributos
    private String corEscama;

    // Métodos sobrescrito
    @Override public void locomover(){
        System.out.println("Nadando");
    }

    @Override public void alimentar(){
        System.out.println("Comendo alga");
    }

    @Override public void emitirSom(){
        System.out.println("Peixe não emite som");
    }

    // Método
    public void soltarBolha(){
        System.out.println("Soltou uma bolha\n");
    }

    // Método sobrecarga
    public Peixe(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    // Métodos especiais
    public String getCorEscama(){
        return this.corEscama;
    }
}