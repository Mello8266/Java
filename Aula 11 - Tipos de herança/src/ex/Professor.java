package ex;

public class Professor extends Pessoa{
    private String especialidade;
    private float sal;

    public void aumentarSal(float aum){
        this.sal += aum;
    }

    @Override
    public String toString() {
        return super.toString() + " esp:" + this.especialidade + " sal:R$" + this.sal;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public float getSal() {
        return this.sal;
    }
    public void setSal(float sal) {
        this.sal = sal;
    }

}