package ex;
public class Pessoa {
    //Atributo
    private String nome;
    private int idade;
    private String sexo;

    //? Métodos
    public void fazerAniv(){
        setIdade(getIdade() + 1);
    }

    //! Construtor
    public Pessoa(String nome, int idade, String sexo) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
    }

    //* SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //*  GETTERS
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getSexo() {
        return sexo;
    }
}