package ex;

public class Professor extends Pessoa{
    //* Atributos
    private String especialidade;
    private float salario;

    //? Métodos
    public void receberAum(float s){
        this.salario += s;
    }

    //! Métodos especiais
    public Professor(String nome, int idade, String sexo, String esp, float sal){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        this.especialidade = esp;
        this.salario = sal;
    }
    public String getEspecialidade() {
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }


}