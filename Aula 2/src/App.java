public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        //! Atributos 
        c1.modelo = "Bic"; // Chamada de um atributo
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;

        // * Metódos
        c1.tampar();  // Chamada de método
        c1.rabiscar();
        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo = "Fab castle";
        c2.cor = "Preta";

        c2.destampar();
        c2.rabiscar();
        c2.status();        
    }
}
