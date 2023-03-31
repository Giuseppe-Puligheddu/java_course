import java.util.HashMap;
import java.util.Map;

//! Classe dper utilizzare il pattern Singleton
//! Con questo pattern cro una mappa dove memorizzare degli Oggetti
//! Se istanzio un nuovo oggetto che è gia presente in memoria, 
//! il nuovo oggetto punterà al riferimento di quello gia presente in memoria
//! facendomi risparmiare memoria
public class JeegFactorySingleton {
    private Map<JeegComponents , Object> registry = new HashMap<JeegComponents, Object>();



    //! Metodo senza cast
    // public Object instance(JeegComponents jeegComponents){
        
    //     switch(jeegComponents){
    //         case Legs :
    //             if(!registry.containsKey(jeegComponents)){
    //                 registry.put(jeegComponents, new Legs());
    //             }
    //             break;

    //         case Tank :
    //             if(!registry.containsKey(jeegComponents)){
    //                 registry.put(jeegComponents, new Tank());
    //             }
    //             break;

    //         case LanciaMissiliDx :
    //             if(!registry.containsKey(jeegComponents)){
    //                 registry.put(jeegComponents, new LanciaMissili("Destro"));
    //             }
    //             break;

    //         case LanciaMissiliSx :
    //             if(!registry.containsKey(jeegComponents)){
    //                 registry.put(jeegComponents, new LanciaMissili("Sinistro"));
    //             }
    //             break;

    //         case LaserSx :
    //             if(!registry.containsKey(jeegComponents)){
    //                 registry.put(jeegComponents, new Laser("Sinistro"));
    //             }
    //             break;

    //         case LaserDx :
    //             if(!registry.containsKey(jeegComponents)){
    //                 registry.put(jeegComponents, new Laser("Destro"));
    //             }
    //             break;
    //     }

    //     return registry.get(jeegComponents);
    // }

    //! MEtodo con cast interno
        @SuppressWarnings("unchecked")
    public <T> T instance(JeegComponents jeegComponents, Class<T> classType){
        
            switch(jeegComponents){
                case Legs :
                    if(!registry.containsKey(jeegComponents)){
                        registry.put(jeegComponents, new Legs());
                    }
                    break;
    
                case Tank :
                    if(!registry.containsKey(jeegComponents)){
                        registry.put(jeegComponents, new Tank());
                    }
                    break;
    
                case LanciaMissiliDx :
                    if(!registry.containsKey(jeegComponents)){
                        registry.put(jeegComponents, new LanciaMissili("Destro"));
                    }
                    break;
    
                case LanciaMissiliSx :
                    if(!registry.containsKey(jeegComponents)){
                        registry.put(jeegComponents, new LanciaMissili("Sinistro"));
                    }
                    break;
    
                case LaserSx :
                    if(!registry.containsKey(jeegComponents)){
                        registry.put(jeegComponents, new Laser("Sinistro"));
                    }
                    break;
    
                case LaserDx :
                    if(!registry.containsKey(jeegComponents)){
                        registry.put(jeegComponents, new Laser("Destro"));
                    }
                    break;
            }
    
            return (T) registry.get(jeegComponents);
        }
    

}
