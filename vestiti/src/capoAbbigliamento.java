public class capoAbbigliamento {
    private String tipo;
    private String marca;
    private String taglia;
    private String colore;
    private float prezzo;
    private int nArticolo; 

    public capoAbbigliamento(String tipo, String marca, String taglia, String colore, float prezzo, int nArticolo) {
        this.tipo = tipo;
        this.marca = marca;
        this.taglia = taglia ;
        this.colore = colore;
        this.prezzo = prezzo;
        this.nArticolo = nArticolo; 

    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getTaglia() {
        return taglia;
    }

    public String getColore() {
        return colore;
    }

    // Changed return type from int to float
    public float getPrezzo() {
        return prezzo;
    }
    public int getnArticolo(){
        return nArticolo; 
    }

    public void setPrezzo(float c) {
        // No loop needed
        prezzo = c;
    }

    public void sconto() {
        if (tipo == "Camicia") {
            prezzo = prezzo - (prezzo / 100 * 30);
            // Fixed typo
            System.out.println("L' articolo numero: "+ nArticolo + " e' in sconto.");
        }
    }

}