package ex;
public class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int paginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //? Métodos
    public void detalhes(){
        System.out.println();
        System.out.println("Livro: " + getTitulo() + ", autor(a): " + getAutor() + ", contém " + getPaginas() + " páginas");
        System.out.print("O livro está ");
        System.out.print((isAberto()) ? "aberto": "fechado");
        System.out.println(" e está na página " + getPagAtual());
        System.out.println(leitor.getNome() + " é quem está lendo ");
    }

    //? Sobrescrevendo métodos
    @Override public void abrir() {
        setAberto(true);
    }

    @Override public void fechar() {
       setAberto(false);
    }

    @Override public void folhear(int p) {
        setPagAtual(p);
    }

    @Override public void avancarPag() {
        if (isAberto()){
            setPagAtual(getPagAtual() + 1);
        }
    }

    @Override public void voltarPag() {
        if (isAberto()){
            setPagAtual(getPagAtual() - 1);
        }
    }

    //! Construtor
    public Livro(String titulo, String autor, int paginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    //* GETTERS
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getPaginas() {
        return paginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public boolean isAberto() {
        return aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    //* SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public void setPagAtual(int pagAtual) {
        if (pagAtual <= this.paginas){
            this.pagAtual = pagAtual;
        } else {
            this.pagAtual = this.paginas;
        }
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}