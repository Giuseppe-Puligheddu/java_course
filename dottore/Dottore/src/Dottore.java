public class Dottore {
    private Braccia manoDx;
    private Braccia manoSx;
    private Movimento movimento;

    public Dottore(Braccia manoDx, Braccia manoSx, Gambe gambe) {
        this.setManoDx(manoDx);
        this.setManoSx(manoSx);
        this.setMovimento(movimento);
    }
    public Braccia getManoDx() {
        return manoDx;
    }
    public void setManoDx(Braccia manoDx) {
        this.manoDx = manoDx;
    }
    public Braccia getManoSx() {
        return manoSx;
    }
    public void setManoSx(Braccia manoSx) {
        this.manoSx = manoSx;
    }
    public Movimento getMovimento() {
        return movimento;
    }
    public Movimento setMovimento(Movimento movimento) {
        return movimento;
    }


    public void muovitiAvanti(){
        System.out.println("Mi muovo avanti");
    }

    public void muovitiIndietro(){
        System.out.println("Mi muovo indietro");
    }

    public void opera(){
        this.manoDx.opera();
        this.manoSx.opera();
    }
    
    
}
