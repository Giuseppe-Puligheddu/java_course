public class Propulsori extends Movimento implements Attack{

    @Override
    public void muovitiAvanti() {
        System.out.println("Sto volando in avanti");
    }

    @Override
    public void muovitiIndietro() {
        System.out.println("Sto volando indietro");
    }
    
    @Override
    public void attacca(){
        System.out.println("Ti brucio col propulsore");
    }
}
