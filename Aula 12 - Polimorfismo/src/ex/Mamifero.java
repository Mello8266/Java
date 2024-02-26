package ex;

public class Mamifero extends Animal{
    // Atributos
    private String corPelo;

    // Métodos sobrescritos
    @Override public void locomover(){
        System.out.println("Correndo");
    }
    
    @Override public void alimentar(){
        System.out.println("Mamando");
    }

    @Override public void emitirSom(){
        System.out.println("Som de mamífero \n");
    }

    // Métodos especiais
    public Mamifero(float peso, int idade, int membros, String corPelo){
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    public String getCorPelo(){
        return this.corPelo;
    }
    public void setCorPelo(String cor){
        this.corPelo = cor;
    }
}