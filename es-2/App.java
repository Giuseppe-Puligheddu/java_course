import java.util.Scanner;

class App{
    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Inserisci numeri");
        int number = scanner.nextInt();
        int sum = 0;

        // while(number != 0){
        //     int digit = number % 10;
        //     sum = sum + digit;
        //     number = number / 10;


        String numeroStringa = Integer.toString(number);

        for(int i = 0; i < numeroStringa.length(); i++){
            char carattere = numeroStringa.charAt(i);
            int cifra = Character.getNumericValue(carattere);
            sum += cifra;
        }
        System.out.println("La somma è: " + sum );
    }
}