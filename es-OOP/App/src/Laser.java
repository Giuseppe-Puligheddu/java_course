public class Laser extends Arm{
    Laser laser;
    
    public Laser(String side) {
        super(side);
        this.laser = laser;
    }

    public void attacca(){
        System.out.println("Ti attacco col laser al braccio " + side);
    }
}
