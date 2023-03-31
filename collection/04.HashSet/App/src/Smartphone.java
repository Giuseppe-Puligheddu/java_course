public class Smartphone {
    private String modello;
    private String marca;
    private int prezzo;
    public Smartphone(String modello, String marca, int prezzo) {
        this.setModello(modello);
        this.setMarca(marca);
        this.setPrezzo(prezzo);
    }
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    
}
