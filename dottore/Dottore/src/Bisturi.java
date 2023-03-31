public class Bisturi extends Braccia {

    public Bisturi(String side) {
        super(side);
    }

    @Override
    void opera() {
        System.out.println("Ti apro col bisturi nel braccio " + side);
    }
    
}
