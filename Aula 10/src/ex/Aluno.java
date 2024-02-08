package ex;
public class Aluno extends Pessoa{
    //* Atributos
    private int matr;
    private String curso;

    //? Métodos
    public void cancelarMatr(){
        System.out.println("Matricula cancelada!");
    }

    //! Métodos especias
    public Aluno(String nome, int idade, String sexo, int matr, String curso){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        this.matr = matr;
        this.curso = curso;
    }

    public int getMatr() {
        return matr;
    }
    public void setMatr(int matr) {
        this.matr = matr;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}