public class App {
    public static void main(String[] args) throws Exception {
        


        Jeeg jeeg = new Jeeg(new Trivella("Destro"), new LanciaMissili("Sinistro") , new Propulsori());

        
        jeeg.muovitiAvanti();
        jeeg.attacca();
        jeeg.muovitiIndietro();
        

        
    }
}
