// Herança para diferença
package ex;
public class Aluno extends Pessoa{
    private int matr;
    private String curso;

    //? Método
    public void pagarMensalidade(){
        System.out.println("Pagando a mensalidade.");
    }

    //! Métodos especiais
    public int getMatr() {
        return this.matr;
    }
    public void setMatr(int matr) {
        this.matr = matr;
    }
    public String getCurso() {
        return this.curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}