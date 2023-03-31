import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;



public class App {
    public static void main(String[] args) throws Exception {
        

        List<Person> persone = new ArrayList<Person>();

        persone.add(new Person("Giuseppe", "Puligheddu", "28"));

        persone.add(new Person("James" , "Bond", "40"));

        //! ciclo per stampare a schermo i nomi degli oggetti nelle ArrayList
        for(Person p : persone){
            System.out.println(p.getName());
        }

        //!Rimuovo persona con indice 0
        persone.remove(0);
        for(Person p : persone){
            System.out.println(p.getName());
        }

        //! Elimino tutta l'ArrayList
        persone.clear();
        for(Person p : persone){
            System.out.println(p.getName());
        }




    }
}
