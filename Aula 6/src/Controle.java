public class Controle {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //? Sobrescrevendo métodos
    public void ligar(){
        this.setLigado(true);
    }
    public void desligar(){
        this.setLigado(false);
    }
    public void abrirMenu(){
        int i;
        System.out.println(this.getLigado());
        for (i = 0; i < this.getVolume(); i++){
            System.out.println("|");
        }
        System.out.println(getTocando());
    }
    public void fecharMenu(){
        if (this.getLigado()){
            System.out.println("Fechando menu...");
        }
    }
    public void maisVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 1);
        }
    }
    public void menosVolume(){
        if (getLigado()){
            this.setVolume(this.getVolume() - 1);
        }
    }
    public void ligarMudo(){
        if (this.getLigado() & this.getVolume() > 0){
                this.setVolume(0);
        }
    }
    public void desligarMudo(){
        if (this.getLigado() & this.getVolume() == 0){
           this.setVolume(50);
        }
    }
    public void play(){
        if (this.getLigado() & ! this.getTocando()){
            this.setTocando(true);
        }
    }
    public void pause(){
        if (this.getLigado() & this.getTocando()){
            this.setTocando(false);
        }
    }

    //! Métodos Especiais
    //* Construtor
    public Controle(){
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    //* SETTER
    private void setVolume(int n){
        this.volume = n;
    } 
    private void setLigado(boolean v){
        this.ligado = v;
    }
    private void setTocando(boolean v){
        this.tocando = v;
    }

    //* GETTER
    private int getVolume(){
        return this.volume;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private boolean getTocando(){
        return this.tocando;
    }
}