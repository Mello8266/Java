public class Controle implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //? Sobrescrevendo métodos
    @Override
    public void ligar(){
        this.setLigado(true);
    }
    @Override
    public void desligar(){
        this.setLigado(false);
    }
    @Override
    public void abrirMenu(){
        if (getLigado()){
            System.out.println("---- MENU ----");
            System.out.println((getLigado()) ? "Está ligada": "Está desligada");
            System.out.println((getTocando()) ? "Está tocando: sim": "Não está tocando" );
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i < this.getVolume(); i+=10){
                System.out.print("|");
            }
            System.out.println();
        } else{
            System.out.println("impossível exibir o menu com a tv desligada");
        }
    }
    @Override
    public void fecharMenu(){
        if (this.getLigado()){
            System.out.println("Fechando menu...");
        }
    }
    @Override
    public void maisVolume(int n){
        if (this.getLigado() && this.getVolume() <= 100){
            for (int i = 0; i < n; i++){
                this.setVolume(this.getVolume() + 1);
            }
        }
    }
    @Override
    public void menosVolume(int n){
        if (this.getLigado() && this.getVolume() > 0){
            for (int i = 0; i < n; i++){
                this.setVolume(this.getVolume() - 1);
            }
        }
    }
    @Override
    public void ligarMudo(){
        if (this.getLigado() && this.getVolume() > 0){
                this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo(){
        if (this.getLigado() && this.getVolume() == 0){
           this.setVolume(50);
        }
    }
    @Override
    public void play(){
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }
    @Override
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
        if (this.volume >= 100){
            this.volume = 100;
        } else if (this.volume <= 0){
            this.volume = 0;
        }
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

    // Metódos abstrados
}