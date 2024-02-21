package ex;

public class Tecnico extends Aluno{
    private String registroProfisional;

    public void praticar(){
        System.out.println(this.nome + " está praticando " + this.registroProfisional);
    }

    public String getRegistroProfisional() {
        return registroProfisional;
    }
    public void setRegistroProfisional(String registroProfisional) {
        this.registroProfisional = registroProfisional;
    }

}