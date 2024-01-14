public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true; // Aqui fora não pode mexer em atributos privados
        c1.tampar(); 
        c1.status();     
        
    }
}
