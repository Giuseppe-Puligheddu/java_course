public class LanciaMissili extends Arm{

    LanciaMissili lanciaMissili;
    public LanciaMissili(String side) {
        super(side);
        this.lanciaMissili = lanciaMissili;
    }

    @Override
    public void attacca() {
        System.out.println("Ti attacco con i missili al braccio " + side);
    }
    
}
