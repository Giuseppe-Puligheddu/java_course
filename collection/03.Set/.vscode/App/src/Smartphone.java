

public class Smartphone {
    private String marca;
    private String modello;
    private int prezzo;
    public Smartphone(String marca, String modello, int prezzo) {
        this.setMarca(marca);
        this.setModello(modello);
        this.setPrezzo(prezzo);
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public int getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    
    //! sovrascrivo il metodo equals per ritornarci true se due oggetti sono uguali negli attributi.
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Smartphone){
            Smartphone other = (Smartphone) obj;
            return (marca == other.marca && modello == other.modello && prezzo == other.prezzo) ? true : false;
        } else{
            return false;
        }
    }
    //! Sovrascrivo il metodo hashcode per generare un hash uguale con la somma degli attributi. In questo modo, se creo un oggetto con gli attributi uguali, avrò un oggetto completamente identico e dunque errore.
    @Override
    public int hashCode() {
        return (marca + modello + prezzo).hashCode();
    }

}
