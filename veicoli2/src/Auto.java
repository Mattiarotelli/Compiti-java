import java.util.Objects;

public class Auto extends Veicolo {
    private String tipo;
    public Auto(String matricola, String proprietario, String tipo){
        super(matricola,proprietario);
        this.tipo=tipo;
    }
    public String getTipo(){ return tipo;}
    public void setTipo(String tipo){this.tipo = tipo; }
    public void Print(){
        if(Objects.equals(tipo, "sportiva"))
            System.out.println(matricola+proprietario+tipo);
    }
}
