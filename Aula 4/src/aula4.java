public class aula4 {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta("BIC", "Azul", 0.5f);
                
        System.out.println("O modelo da caneta é " + c1.getModelo() + " da cor " + c1.getCor()  + 
        " de ponta " + c1.getPonta());
    }
}
