public class Cachorro extends Lobo{
    // Método sobrescrito
    @Override public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }

    // Método sobrecarga
    public void reagir(String frase){
        if (frase == "Toma comida" || frase == "Bebezin" || frase == "Olá"){
            System.out.println("Abana o rabo");
        } else {
            System.out.println("AU! AU! AU!");
        }
    }

    public void reagir(int hora, int min){
        if (hora < 12){
            System.out.println("Abana");
        } else if(hora >= 18){
            System.out.println("Ignora");
        } else{
            System.out.println("Abana e late");
        }
    }

    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abana para o dono");
        } else{
            System.out.println("Rosna e late");
        }
    }

    public void regir(int idade, float peso){
        if (idade < 5){
            if (peso < 10){
                System.out.println("Abanar");
            } else {
                System.out.println("Rosnar");
            }
        } 
        else {
            if (peso < 10){
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }

    // Construtor
    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    } 
}