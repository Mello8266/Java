// Classe final
package ex;
public final class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(int b){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    @Override public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamanto facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}