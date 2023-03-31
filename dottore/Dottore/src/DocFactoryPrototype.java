public class DocFactoryPrototype extends DocFactory{
    
    @Override
    public Object instance(DocComponents docComponents){
        Object component = null;
        switch(docComponents){
            case ForbiciDx :
                component = new Forbici("Destro");
                break;
            case ForbiciSx :
                component = new Forbici("Sinistro");
                break;
            case BisturiSx :
                component = new Bisturi("Sinistro");
                break;
            case BisturiDx :
                component = new Bisturi("Destro");
                break;
            case Gambe :
                component = new Gambe();
                break;
        }

        return component;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T instanceCasting(DocComponents docComponents, Class<T> classType){
        Object component = null;
        switch(docComponents){
            case ForbiciDx :
                component = new Forbici("Destro");
                break;
            case ForbiciSx :
                component = new Forbici("Sinistro");
                break;
            case BisturiSx :
                component = new Bisturi("Sinistro");
                break;
            case BisturiDx :
                component = new Bisturi("Destro");
                break;
            case Gambe :
                component = new Gambe();
                break;
        }

        return (T) component;
    }
}
