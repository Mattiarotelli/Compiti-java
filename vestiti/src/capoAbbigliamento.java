public class capoAbbigliamento {
    private final String tipo, marca, taglia, colore;
    private float prezzo;
    private final int nArticolo;

    public capoAbbigliamento(String tipo, String marca, String taglia, String colore, float prezzo, int nArticolo) {
        this.tipo = tipo;
        this.marca = marca;
        this.taglia = taglia;
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

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float c) {
        prezzo = c;
    }

    public int getnArticolo() {
        return nArticolo;
    }

    public void sconto() {
        if (tipo == "Camicia") {
            prezzo = prezzo - (prezzo / 100 * 30);
            // Fixed typo
            System.out.println("L' articolo numero: " + nArticolo + " e' in sconto.");
        }
    }

}