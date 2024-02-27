public class Lobo  extends Mamifero {
    // Método sobrescrito
    @Override public void emitirSom(){
        System.out.println("Auuuuuuuuuuuuuuuuuuuuuu!");
    }

    // Construtor
    public Lobo(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
}