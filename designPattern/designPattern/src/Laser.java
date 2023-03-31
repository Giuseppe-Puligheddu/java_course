public class Laser extends Arm{

    public Laser(String side) {
        super(side);
    }

    @Override
    public void attacca() {
        System.out.println("Ti brucio col laser nel braccio " + side);
    }
    

}
