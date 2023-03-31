import java.util.TreeSet;
import java.util.Set;


public class App {
    public static void main(String[] args) throws Exception {
        
        //! TREESET -> collection che restituisce i valori in maniera ordinata
        //? ES con i numeri
    //     Set<Integer> numbers = new TreeSet<Integer>(
    //         Set.of(10,3,124,95, 64)
    //     );

    //     System.out.println(numbers);

        Set<String> names = new TreeSet<>(
            Set.of("Giuseppe", "Luca", "Antonella", "John")
        );

        System.out.println(names);



    }
}
