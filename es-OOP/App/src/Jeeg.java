public class Jeeg {
    private Arm armDx;
    private Arm armSx;
    private Movimento movimento;

    public Jeeg(Arm armDx, Arm armSx, Movimento movimento) {
        this.armDx = armDx;
        this.armSx = armSx;
        this.movimento = movimento;
    }

    public void attacca(){
        this.armDx.attacca();
        this.armSx.attacca();
        this.armSx.attacca();
        this.armDx.attacca();
        Class<? extends Object> classe = movimento.getClass();
        if(classe.toString().equals("class Propulsori")){
            Propulsori a = (Propulsori) this.movimento;
            a.attacca();
        }
    }

    public void muovitiAvanti(){
        this.movimento.muovitiAvanti();
    }

    public void muovitiIndietro(){
        this.movimento.muovitiIndietro();
    }

    

}
