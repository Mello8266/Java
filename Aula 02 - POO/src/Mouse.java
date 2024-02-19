// Exercício

public class Mouse {
    String marca;
    String modelo;
    String cor;
    int botao;
    float peso;
    boolean conectado;

    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Botões: " + this.botao);
        System.out.println("Peso: " + this.peso + "g");
        System.out.println("Está conectado: " + this.conectado);
    }

    void conectar(){
        if (conectado == true){
            System.out.println("Mouse já está conectado.");
        } else {
            System.out.println("Conectando...");
        }
    }

    void desconectar(){
        if (this.conectado == false){
            System.out.println("Mouse já está deconectado.");
        } else {
            System.out.println("Desconectando mouse");
        }
    }

    void clicar(){
        System.out.println("Clicando...");
    }
}