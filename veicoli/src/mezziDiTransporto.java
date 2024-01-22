public class mezziDiTransporto {
    protected float velocita; 
    protected String tipo; 
    protected int numero;  //proteced serve a utlizzare gli attr. anche nelle sott. classi
    public mezziDiTransporto ( float velocita, String tipo, int numero){
        this.velocita = velocita; 
        this.tipo = tipo; 
        this.numero = numero; 

    }
    public float getVelocita(){
        return velocita; 
    }
    public String getTipo(){
        return tipo; 

    }
    public int getNumero(){
        return numero; 
    }
}