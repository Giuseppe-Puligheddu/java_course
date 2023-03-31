public class App {
    public static void main(String[] args) throws Exception {
        
        // Bisturi bis = new Bisturi("Sinistro");

        // Forbici forbici = new Forbici("Destro");

        // Gambe gambe = new Gambe();


        //! Factory con prototype senza cast
        // DocFactoryPrototype factory = new DocFactoryPrototype();

        // Bisturi bisturi = (Bisturi) factory.instance(DocComponents.BisturiDx);

        // Forbici forbici = (Forbici) factory.instance(DocComponents.ForbiciSx);

        // Gambe gambe = (Gambe) factory.instance(DocComponents.Gambe);


        //! Factory singleton con cast

        DocFactorySingleton factory = new DocFactorySingleton();
        
        Bisturi bisturi = factory.instanceCasting(DocComponents.BisturiDx, Bisturi.class);

        Forbici forbici = factory.instanceCasting(DocComponents.ForbiciSx, Forbici.class);

        Gambe gambe = factory.instanceCasting(DocComponents.Gambe, Gambe.class);

        Gambe gambe2 = factory.instanceCasting(DocComponents.Gambe, Gambe.class);

        //! Le due istanze di gambe puntano allo stesso riferimento così da non creare un nuovo oggetto e risparmiare più memoria

        System.out.println(gambe);
        System.out.println(gambe2);



        Dottore doc = new Dottore(bisturi, forbici, gambe);

        doc.muovitiAvanti();
        doc.opera();
        doc.muovitiIndietro();
    }
}
