public class Auto {
    private String modello;
    private String targa;
    private String marca;

    public Auto(String modello, String targa, String marca){
        this.modello=modello;
        this.targa=targa;
        this.marca=marca;
    }

    public String getModello(){ return modello; }
}
