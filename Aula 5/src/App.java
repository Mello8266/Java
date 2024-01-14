public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco p1 = new ContaBanco();
        p1.setConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.sacar(150);
        p1.fecharConta();
        p1.status();

        ContaBanco p2 = new ContaBanco();
        p2.setConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(1000);
        p2.status();
    }
}
