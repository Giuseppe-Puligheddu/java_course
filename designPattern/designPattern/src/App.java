public class App {
    public static void main(String[] args) throws Exception {
    

        // LanciaMissili lm = new LanciaMissili("Destro");
        // Laser ls = new Laser("Sinistro");

        // Legs legs = new Legs();


        // Jeeg j1 = new Jeeg(lm, ls, legs);

        // j1.muovitiAvanti();
        // j1.attacca();
        // j1.muovitiIndietro();


        //! Utilizzo la factory

        // JeegFactory factory = new JeegFactory();

        // LanciaMissili lm = (LanciaMissili) factory.instance(JeegComponents.LanciaMissiliDx);

        // Laser ls = (Laser) factory.instance(JeegComponents.LaserSx);

        // Tank tank = (Tank) factory.instance(JeegComponents.Tank);


        //! Utilizzo la factory che casta l'oggetto direttamente nella funzione

        // JeegFactory factory = new JeegFactory();

        // LanciaMissili lm = factory.instance(JeegComponents.LanciaMissiliDx, LanciaMissili.class);
        // Laser ls = factory.instance(JeegComponents.LaserSx, Laser.class);
        // Tank tank = factory.instance(JeegComponents.Tank, Tank.class);

        // Jeeg j1 = new Jeeg(lm, ls, tank);


        // j1.muovitiAvanti();
        // j1.attacca();
        // j1.muovitiIndietro();

        //! factory singleton con metodo senza cast interno
        // JeegFactorySingleton factory = new JeegFactorySingleton();

        // LanciaMissili lm = (LanciaMissili) factory.instance(JeegComponents.LanciaMissiliDx);


        // Laser ls = (Laser) factory.instance(JeegComponents.LaserDx);

        // Laser ls2 = (Laser) factory.instance(JeegComponents.LaserDx);


        // System.out.println(ls);
        // System.out.println(ls2);


        JeegFactorySingleton factory = new JeegFactorySingleton();

        LanciaMissili lm = factory.instance(JeegComponents.LanciaMissiliDx, LanciaMissili.class);

        Laser ls = factory.instance(JeegComponents.LaserSx, Laser.class);


        Jeeg j1 = new Jeeg(lm, ls, null);

        j1.muovitiAvanti();
        j1.attacca();
        j1.muovitiIndietro();

        
    }
}
