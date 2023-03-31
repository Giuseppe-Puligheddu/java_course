
//!scrivere una classe generica che prenda in input un array e implementi dei metodi che ritornino degli elementi filtrati in base a delle caratteristiche ( numeri pari, numeri dispari, numeri primi )


public class GenericClass {
    
    public static <T> T numPari(T[] data){
        for(int i = 0; i < data.length; i++){
            int numPari = 0;
            if(data[i] % 2 == 0)numPari = data[i];
        }
    }
    

    
}
