package ex;
public class App {
    public static void main(String[] args) throws Exception {
        Aluno l1 = new Aluno();
        l1.setNome("Júlia");
        l1.setMatr(22323);
        l1.setIdade(24);
        l1.setSexo("F");
        l1.setCurso("Nutrição");
        l1.pagarMensalidade();
        
        Visitante v1  = new Visitante();
        v1.setNome("Aurélio");
        v1.setIdade(40);
        v1.setSexo("M");

        Bolsista b1 = new Bolsista();
        b1.setNome("Jorge");
        b1.setMatr(111222);
        b1.setIdade(23);
        b1.setSexo("M");
        b1.setCurso("Sistema de informação");
        b1.setBolsa(50f);
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Asenjo");
        p1.setIdade(60);
        p1.setSexo("M");
        p1.setEspecialidade("Programação");
        p1.setSal(10000);
        p1.aumentarSal(5000);
        System.out.println(p1.toString());
    }
}
