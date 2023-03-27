import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        //! scrivere un programma che prenda in input un numero, che crei un array di lunghezza pari al numero inserito, che chieda un numero di elementi pari al numero inserito e ritorni il valore massimo inserito
        
        
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();

        System.out.println("Inserisci il numero di numeri che vuoi inserire");

        int[] numbers = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.println("Inserisci il numero");
            numbers[i] = scanner.nextInt();
        }
        
        int position = 0;
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            largest = numbers[i];
            position = i;
        }
        
        System.out.println(" il valore maggiore nell array è " + largest + " in posizione" + position );
    
    }
}