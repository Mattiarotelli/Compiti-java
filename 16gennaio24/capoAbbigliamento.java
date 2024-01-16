public class capoAbbigliamento{
    private String tipo;
    private String marca;
    private String taglia;
    private String colore;
    private int prezzo;
    public capoAbbigliamento(String tipo, String marca, String taglia, String colore, int prezzo){
        this.tipo=tipo;
        this.marca=marca;
        this.taglia=taglia;
        this.colore=colore;
        this.prezzo=prezzo;

    }
    public String getTipo(){
        return tipo;
    }
    public String getMarca(){
        return marca;
    }
    public String getTaglia(){
        return taglia;
    }
    public String getColore(){
        return colore;
    }
    public String getPrezzo(){
        return prezzo;
    }
    public void setPrezzo(int c){
        prezzo=c;
    }
    public void sconto(int c){
        if(tipo=="Camicia"){
            prezzo=prezzo-(prezzo/100*c);
        }
    }
    
}