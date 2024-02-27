package ex;
import ex.mamiferos.Cachorro;
import ex.mamiferos.Canguru;

public class App {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero(31.7f, 13, 4, "marrom" );
        m.locomover();
        m.alimentar();
        m.emitirSom();

        Canguru can = new Canguru(25.4f, 7, 4, "marrom");
        can.locomover();
        can.usarBolsa();

        Cachorro cac = new Cachorro(8.31f, 3, 4, "branco");
        cac.emitirSom();
        cac.abanarRabo();
        cac.enterrarOsso();

        Reptil r = new Reptil(23.6f, 8, 4, "verde");
        r.locomover();
        r.alimentar();
        r.emitirSom();

        Peixe p = new Peixe(1.2f, 2, 2, "azul");
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        Ave a = new Ave(5.2f, 5, 2, "preto");
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
    }
}
