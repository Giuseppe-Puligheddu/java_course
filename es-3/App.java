import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("inserisci numero");
        int numero = scanner.nextInt();
        // int reverse = 0;
        // while(numero != 0){
        //     int digit = numero % 10;
        //     reverse = (reverse * 10) + digit;
        //     numero = numero / 10;
        // }
        // System.out.println("il contraio è :" + reverse);


        
        String numeroStringa = Integer.toString(numero);

        String reverse = new StringBuilder(numeroStringa).reverse().toString();

        int reverso = Integer.parseInt(reverse);

        System.out.println("il numero al rovescio è: " + reverso);

    }
}