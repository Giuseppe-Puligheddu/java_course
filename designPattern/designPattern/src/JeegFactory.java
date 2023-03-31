import javax.swing.AbstractAction;

public  class JeegFactory {


    //! Factory per istanziare Oggetti senza casting
    // public Object instance( JeegComponents jeegComponents){
    //     Object component = null;
    //     switch(jeegComponents){
    //         case Legs:
    //             component = new Legs();
    //             break;
    //         case Tank :
    //             component = new Tank();
    //             break;
    //         case LanciaMissiliDx:
    //             component = new LanciaMissili("Destro");
    //             break;
    //         case LanciaMissiliSx:
    //             component = new LanciaMissili("Sinistro");
    //             break;
    //         case LaserDx:
    //             component = new Laser("Destro");
    //             break;
    //         case LaserSx:
    //             component = new Laser("Sinistro");
    //             break;
    //     }
    //     return component;
    // }



    //! Factory prototype che ritorna un oggetto gia' castato
    // @SuppressWarnings("unchecked")
    // public <T> T instance( JeegComponents jeegComponents, Class<T> classType){
    //         Object component = null;
    //         switch(jeegComponents){
    //             case Legs:
    //                 component = new Legs();
    //                 break;
    //             case Tank :
    //                 component = new Tank();
    //                 break;
    //             case LanciaMissiliDx:
    //                 component = new LanciaMissili("Destro");
    //                 break;
    //             case LanciaMissiliSx:
    //                 component = new LanciaMissili("Sinistro");
    //                 break;
    //             case LaserDx:
    //                 component = new Laser("Destro");
    //                 break;
    //             case LaserSx:
    //                 component = new Laser("Sinistro");
    //                 break;
    //         }
    //         return (T) component;
    //     }
}
