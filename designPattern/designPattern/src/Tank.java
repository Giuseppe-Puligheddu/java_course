public class Tank extends Moveable implements CanAttack {
    
    @Override
    public void muovitiAvanti(){
        System.out.println("Rotolo avanti");
    }
    @Override
    public void muovitiIndietro(){
        System.out.println("Rotolo indietro");
    }

    @Override
    public void attacca(){
        System.out.println("Ti sparo col tank");
    }
}
