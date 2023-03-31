import javax.management.InstanceAlreadyExistsException;

public abstract class DocFactory {
    
    abstract public Object instance(DocComponents docComponents);
    abstract public <T> T instanceCasting(DocComponents docComponents, Class<T> classType);
}
