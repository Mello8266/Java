public class objeto {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        m1.marca = "Kysona";
        m1.modelo = "M600";
        m1.cor = "Branco";
        m1.botao = 6;
        m1.peso = 55f;
        m1.conectado = true;
        
        m1.status();
        m1.desconectar();

        System.out.println();

        Mouse m2 = new Mouse();
        m2.marca = "Redragon";
        m2.modelo = "Cobra";
        m2.cor = "Preto";
        m2.botao = 6;
        m2.peso = 136f;
        m2.conectado = false;

        m2.status();
        m2.conectar();
    }
}