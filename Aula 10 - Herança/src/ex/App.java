package ex;
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();

        p1.setNome("Pedro");
        p1.setIdade(47);
        p1.setSexo("F");
        p1.status();

        Aluno p2 = new Aluno("Vinnycius", 19, "M", 3008983, "Informática");
        p2.status();

        Professor p3 = new Professor("Rebeca", 34, "F", "Química", 5500.f);
        p3.status();

        Funcionario p4 = new Funcionario("Júlia", 22, "F", "Advogacia", true);
        p4.status();
    }
}
