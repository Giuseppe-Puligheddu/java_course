public class LanciaMissili extends Arm {

    public LanciaMissili(String side) {
        super(side);
    }

    @Override
    public void attacca() {
        System.out.println("Ti sparo un missile col braccio " + side);
    }
    
}
