public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;    

    //? Metódos
    public void abrirConta(String t){
        this.setTipo(t);
        if (this.getTipo() == "CC"){
            this.setSaldo(50);
        } 
        else if (this.getTipo() == "CP") {
            this.setSaldo(150);
        } else {
            System.out.println("Erro! Tipo de conta inválida");
        }
        this.setStatus(true);
    }
    public void fecharConta(){
        if (this.getSaldo() < 0){
            System.out.println("ERRO! A conta está devendo R$" + this.getSaldo() * -1);
        } else if (this.getSaldo() > 0){
            System.out.println("ERRO! Há R$" + this.getSaldo() +  " na conta");
        } else {
            this.setStatus(false);
        }
    }
    public void depositar(float n){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + n);
        } else {
            System.out.println("ERRO! Conta fechada"); 
        }
    }
    public void sacar(float n){
        if (this.getStatus() == true){
            if (this.getSaldo() > 0){
                if (this.getSaldo() >= n){
                    this.setSaldo(this.getSaldo() - n);
                } else{
                    System.out.println("ERRO! Saldo insuficiente para o saque.");
                }
            } else {
                System.out.println("ERRO! Conta em débito");
            }
        } else {
            System.out.println("ERRO! Conta está fechada");
        }
    }
    public void pagarMensal(){
        float v;
        if (this.getTipo() == "CP"){
            v = 12f;
        } else{
            v = 20f;
        }
        if (this.getStatus()){
            if (this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente para a mensalidade.");
            }
        } else{
            System.out.println("ERRO! Conta fechada.");
        }  
    }

    public void status(){
        System.out.println("----- Conta de " + getDono() + " -----");
        System.out.println("Número: " + this.getConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    //! Metódos especiais
    //* Contrutor
    public ContaBanco(){
        this.setSaldo(0f);
        this.setStatus(false);
    }
    
    //* GETTER
    public int getConta(){
        return this.numConta;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getDono(){
        return this.dono;
    }
    public float getSaldo(){
        return this.saldo ;
    }
    public boolean getStatus(){
        return this.status;
    }

    //* SETTER
    public void setConta(int c){
        this.numConta = c;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public void setDono(String n){
        this.dono = n;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
}