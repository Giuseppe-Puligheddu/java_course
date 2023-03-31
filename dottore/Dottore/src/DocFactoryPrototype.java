public class DocFactoryPrototype {
    

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
}
