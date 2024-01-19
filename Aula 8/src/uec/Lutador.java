package uec;
public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitoria, derrota, empate;
    private float altura, peso;

    //? Métodos
    public void apresentar(){
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("APRESENTANDO - " + getNome() + " diretamente de " + getNacionalidade());
        System.out.print("Com " + getIdade() + " anos");
        System.out.println(" " + getAltura() + "m de altura e pesando " +  getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitoria());
        System.out.println("Perdeu: " + getDerrota());
        System.out.println("Empatou: " + getEmpate());
    }
    public void status(){
        System.out.println();
        System.out.println("------- " + getNome() + " -------");
        System.out.println("É da categoria: " + getCategoria());
        System.out.println(getVitoria() + " vitórias");
        System.out.println(getDerrota() + " derrotas");
        System.out.println(getEmpate() + " empates");
    }
    public void ganharLuta(){
        setVitoria(getVitoria() + 1);
    }
    public void perderLuta(){
        setDerrota(getDerrota() + 1);
    }
    public void empate(){
        setEmpate(getEmpate() + 1);
    }

    //! Métodos especiais
    public Lutador(String no, String na, int  id, float al, float pe, int vi, int de, int em){
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitoria(vi);
        setDerrota(de);
        setEmpate(em);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return this.nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return this.altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }
    public int getVitoria() {
        return this.vitoria;
    }
    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }
    public int getDerrota() {
        return this.derrota;
    }
    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }
    public int getEmpate() {
        return this.empate;
    }
    public void setEmpate(int empate) {
        this.empate = empate;
    }
    public String getCategoria() {
        return this.categoria;
    }
    private void setCategoria() {
        if (this.getPeso() < 52.2f){
            this.categoria = "Invalido";
        } else if (this.getPeso() <= 70.3f){
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9f){
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2f) {
            this.categoria = "Pesado";
        } else{
            this.categoria = "Inválido";
        }
    }
}

