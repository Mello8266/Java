package ex;
public class Bolsista extends Aluno{
    private int bolsa;
    public void renovarBolsa(int b){
        this.bolsa += b;
    }
    @Override public void pagarMensalidade(){

    }
}