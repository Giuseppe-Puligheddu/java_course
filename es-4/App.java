import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero di elementi nell'array: ");
        int n = input.nextInt();

        int[] numeri = new int[n];

        System.out.println("Inserisci " + n + " numeri:");

        // leggi i numeri inseriti dall'utente e salvali nell'array numeri
        for (int i = 0; i < n; i++) {
            numeri[i] = input.nextInt();
        }

        // calcola la somma di tutti i numeri nell'array
        int somma = 0;
        for (int i = 0; i < n; i++) {
            somma += numeri[i];
        }

        System.out.println("La somma di tutti i numeri inseriti è: " + somma);
    }
}