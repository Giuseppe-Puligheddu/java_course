public class Forbici extends Braccia {

    public Forbici(String side) {
        super(side);
    }

    @Override
    void opera() {
        System.out.println("Ti apro con le forbici nel braccio " + side);
    }
    
}
