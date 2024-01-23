package ex;
public class ProjetoLivro {
    public static void main(String[] args) throws Exception {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Vinnycius", 19, "masculino");
        p[1] = new Pessoa("Júlia", 18, "feminino");

        l[0] = new Livro("Niketche", "Paulina Chiziane", 296, p[0]);
        l[1] = new Livro("Alguma poesia", "Carlos Drummond", 210, p[1]);
        l[2] = new Livro("Diário de um Banana 1", "Jeff Kinney", 224, p[1]);

        l[1].abrir();
        l[1].folhear(300);
        l[1].fechar();
        l[1].detalhes();

        l[0].abrir();
        l[0].avancarPag();
        l[0].detalhes();
    }
}
