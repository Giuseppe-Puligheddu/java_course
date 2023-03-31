public abstract class Arm implements CanAttack{


    protected String side;

    public Arm(String side) {
        this.side = side;
    }


    public abstract void attacca();

    
}
