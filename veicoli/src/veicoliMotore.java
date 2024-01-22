public class veicoliMotore extends mezziDiTransporto{
    protected float consumo;
    private boolean stato;  //questa servirà solo in questa classe 
    public veicoliMotore(float velocita, String tipo, int numero, float consumo) { //anche gli att della super classe nel costruttore

    super(velocita, tipo, numero); 
    this.consumo = consumo; 


    }  
    public float getConsumo(){
        return consumo; 
    }
    public boolean accendi(){
        if(stato == false){
            stato = true; 
        }
    }



}