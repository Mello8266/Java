package ex;

public class Funcionario extends Pessoa{
    //* Atributos
    private String setor;
    private boolean trabalhando;

    //? Métodos
    public void mudarTrabalho(){
        this.trabalhando ! = isTrabalhando();
    }

    //! Métodos especiais
    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    public String getSetor(){
        return this.setor;
    }
    public void setSetor(String s){
        this.setor = s;
    }
    public boolean isTrabalhando(){
        return this.trabalhando;
    }
    public void setTrabalhando(boolean t){
        this.trabalhando = t;
    }
}