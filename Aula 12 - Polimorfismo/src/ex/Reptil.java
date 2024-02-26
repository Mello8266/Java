package ex;

public class Reptil extends Animal {
    // Atributos
    private String corEscama;

    // Métodos sobrescritos
    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de réptil \n");
    }

    // Método sobrecarga
    public Reptil(float peso, int idade, int membros, String corEscama){
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    // Métodos especiais
    public String getCorEscama(){
        return this.corEscama;
    }
    public void setCorEscama(String cor){
        this.corEscama = cor;
    }
}