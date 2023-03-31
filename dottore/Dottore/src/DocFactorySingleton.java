import java.util.HashMap;
import java.util.Map;


public class DocFactorySingleton {
    private Map<DocComponents, Object> registry = new HashMap<DocComponents, Object>();

    @SuppressWarnings("unchecked")
    public <T> T instance(DocComponents docComponents, Class<T> classType){
        switch(docComponents){
            case ForbiciDx :
                if(!registry.containsKey(docComponents)){
                    registry.put(docComponents, new Forbici("Destro"));
                }
                break;
            case ForbiciSx :
                if(!registry.containsKey(docComponents)){
                    registry.put(docComponents, new Forbici("Sinistro"));
                }
                break;
            case BisturiDx :
                if(!registry.containsKey(docComponents)){
                    registry.put(docComponents, new Bisturi("Destro"));
                }
                break;
            case BisturiSx :
                if(!registry.containsKey(docComponents)){
                    registry.put(docComponents, new Bisturi("Sinistro"));
                }
                break;
            case Gambe :
                if(!registry.containsKey(docComponents)){
                    registry.put(docComponents, new Gambe());
                }
                break;
        }
        return (T) registry.get(docComponents);
    }

}
