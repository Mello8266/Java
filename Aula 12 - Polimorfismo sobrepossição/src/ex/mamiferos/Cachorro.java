package ex.mamiferos;
import ex.Mamifero;

public class Cachorro extends Mamifero {
    // Método próprio
    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
    public void enterrarOsso(){
        System.out.println("Escondendo osso \n");
    }

    // Sobrescrição de método
    @Override public void emitirSom(){
        System.out.println("AU! AU! AU!");
    }

    // Sobrecarga de método
    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
}