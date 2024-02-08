package ex;
public class App {
    public static void main(String[] args) throws Exception {
        Visitante v1  = new Visitante();
        v1.setNome("Aurélio");
        v1.setIdade(40);
        v1.setSexo("M");
        System.out.println(v1.toString());
    }
}
