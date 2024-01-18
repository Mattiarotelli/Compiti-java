public class capoAbbigliamento {
    private String[] tipo;
    private String[] marca;
    private String[] taglia;
    private String[] colore;
    private int[] prezzo;

    public capoAbbigliamento(String[] tipo, String[] marca, String[] taglia, String[] colore, int[] prezzo) {
        this.tipo = tipo;
        this.marca = marca;
        this.taglia = taglia ;
        this.colore = colore;
        this.prezzo = prezzo;

    }

    public String[] getTipo() {
        return tipo;
    }

    public String[] getMarca() {
        return marca;
    }

    public String[] getTaglia() {
        return taglia;
    }

    public String[] getColore() {
        return colore;
    }

    public int[] getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int c) {
        for(int i = 0; i < prezzo.length; i++){
            prezzo[i] = c;
        }
    }

    public void sconto(int c) {
        for(int i = 0; i< prezzo.length; i++){
            if (tipo[i] == "Camicia") {
                prezzo[i] = prezzo[i] - (prezzo[i] / 100 * c);
                System.out.println("L' articolo numero: "+ i+ " e' in sconto.");
            }
        }

    }

}