import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        //! scrivere un programma che controlli se una stringa è palindroma

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrivi una parola ");

        String parola = scanner.nextLine();

        String reverse = new StringBuilder(parola).reverse().toString();
        if(reverse.equals(parola)){
            System.out.println(parola + " è palindroma");
        } else {
            System.out.println(parola + " non è palindroma");
        }
    }
}