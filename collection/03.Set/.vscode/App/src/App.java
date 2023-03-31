import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        

        // Smartphone smartphone1 = new Smartphone("Samsung", "Note10", 600);
        // Smartphone smartphone2 = new Smartphone("Iphone", "14", 1000);
        // Smartphone smartphone3 = new Smartphone("Nokia", "3310", 100);


        // Set<Smartphone> phone = Set.of(
        //     smartphone1,
        //     smartphone2,
        //     smartphone3
        // );
        //! Non posso aggiungere un altro elemento all'interno di una Set perchè è una collection immutabile.
        // phone.add(new Smartphone("Huawei", "P40", 400));


        // Smartphone smartphone4 = smartphone1;
        
        // Set<Smartphone> phone = Set.of(
        //     smartphone1,
        //     smartphone2,
        //     smartphone3,
        //     smartphone4
        //     );
            //! smartphone 3 e smartphone 4 contengono la stessa referenza, questa operazione non è consentita.
            
            // for(Smartphone s : phone){
            //     System.out.println(s.getMarca());
            // }




            Smartphone smartphone1 = new Smartphone("Samsung", "Note10", 600);
            Smartphone smartphone2 = new Smartphone("Iphone", "14", 1000);
            Smartphone smartphone3 = new Smartphone("Nokia", "3310", 100);
            Smartphone smartphone4 = new Smartphone("Nokia", "3310", 100);


            Set<Smartphone> phones = Set.of(
                smartphone1,
                smartphone2,
                smartphone3,
                smartphone4
            );

            for(Smartphone s : phones){
                System.out.println(s.getMarca());
            }

            System.out.println(smartphone3.equals(smartphone4));


            System.out.println(smartphone3.hashCode());
            System.out.println(smartphone4.hashCode());

    }
}
