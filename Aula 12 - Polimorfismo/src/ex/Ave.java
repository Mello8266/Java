package ex;

public class Ave extends Animal{
    // Atributos
    private String corPena;

    // Métodos sobrescritos
    public Ave(float peso, int idade, int membros, String corPena){
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    @Override public void locomover(){
        System.out.println("Voando");
    }

    @Override public void alimentar(){
        System.out.println("Comendo frutas");
    }

    @Override public void emitirSom(){
        System.out.println("Som de ave");
    }

    // Método
    public void fazerNinho(){
        System.out.println("Contruiu um ninho \n");
    }

    // Métodos especiais
    public String getCorPena(){
        return this.corPena;
    }
    public void setCorPena(String cor){
        this.corPena = cor;
    }
}