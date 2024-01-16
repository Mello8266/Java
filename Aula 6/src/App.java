public class App {
    public static void main(String[] args) throws Exception {
        Controle c = new Controle();
        c.ligar();
        c.maisVolume(100);
        c.abrirMenu();
        c.fecharMenu();

        Controle c1 = new Controle();
        c1.ligar();
        c1.play();
        c1.menosVolume(10);
        c1.abrirMenu();
        c1.desligar();
    }
}
