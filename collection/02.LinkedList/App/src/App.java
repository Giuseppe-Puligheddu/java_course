import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        

        LinkedList<Student> studente = new LinkedList<Student>();

        studente.add(new Student("Giuseppe", "Puligheddu", "28"));
        studente.add(new Student("Brad", "Pitt", "40"));
        studente.add(new Student("John", "Wick", "38"));


        //!Aggiungo Studenta in testa alla lista
        studente.addFirst(new Student("LEonardo", "DiCaprio", "45"));
        for(Student p : studente){
            System.out.println(p.getName());
        }


        //! Rimuovo ultima Studenta nella lista
        studente.removeLast();
        for(Student p : studente){
            System.out.println(p.getName());
        }


    }
}
