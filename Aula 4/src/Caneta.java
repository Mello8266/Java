public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    //* Para declarar um metódo construtor em Java, basta passar o nome da classe no método
    public Caneta(String m, String c, float p){ 
        this.tampar();
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
    }   

    public String getModelo(){ //* String porque o método retorna uma String
        return this.modelo;
    }
    public void setModelo(String m){ //* void porque é um método sem retorno
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
   
    public boolean getTampa(){
        return this.tampada;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}