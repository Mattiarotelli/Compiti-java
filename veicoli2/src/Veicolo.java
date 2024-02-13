public class Veicolo {
    protected String matricola;
    protected String proprietario;
    public Veicolo(String matricola, String proprietario){
        this.matricola=matricola;
        this.proprietario=proprietario;
    }
    public String getMatricola(){ return matricola; }

    public String getProprietario() {
        return proprietario;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
}
