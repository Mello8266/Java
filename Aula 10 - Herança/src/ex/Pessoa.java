package ex;
public class Pessoa {
    //* Atributos
    private String nome;
    private int idade;
    private String sexo;

    //? Métodos
    public void fazerAniv(){
        this.idade ++;
    }

    public void status(){
        System.out.println();
        System.out.println("Nome: " + this.nome  + " idade: " + this.idade + " sexo: " + this.sexo);
    }

    //! Métodos especiais
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String sexo) {
        if (sexo != null) {
            if (sexo == "F" | sexo == "M"){
                this.sexo = sexo;
            } else{
                this.sexo = "Opção inválida";
            }
        } else{
            this.sexo = "Não informado";
        }
    }
}