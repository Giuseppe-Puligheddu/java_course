import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        

        Smartphone s1 = new Smartphone("Samsung", "Note10", 900);
        Smartphone s2 = new Smartphone("Iphone14", "Note10", 1500);
        Smartphone s3 = new Smartphone("Nokia", "3310", 100);

        //! Al contrario della Set, la HashSet può mutare e posso aggiungere o eliminare degli elementi all'interno della lista.
        HashSet<Smartphone> phones = new HashSet<Smartphone>(
            Set.of(
                s1,
                s2,
                s3
            )
        );


        phones.add(new Smartphone("Huawei", "P40", 500));


        for(Smartphone s : phones){
            System.out.println(s.getMarca());
        }
    }
}
