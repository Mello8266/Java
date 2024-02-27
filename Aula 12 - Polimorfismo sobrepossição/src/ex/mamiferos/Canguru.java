package ex.mamiferos;
import ex.Mamifero;

public class Canguru extends Mamifero{

    @Override public void locomover(){
        System.out.println("Saltando");
    }

    public void usarBolsa(){
        System.out.println("Usando bolsa \n");
    }

    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
}