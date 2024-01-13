// ? Classe - molde
public class Caneta {
    //! Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //* Metódos
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.print("Está tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true){
            System.out.println("Erro! Não pode rabiscar");
        } 
        else{
            System.out.println("Rabiscando...");
        }

    }

    void tampar() {
        this.tampada = true; // this é o nome do objeto que chamou a classe
    }

    void destampar() {
        this.tampada = false;
    }
}