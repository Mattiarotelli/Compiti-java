public class studente{
    private String nome;
    private String cognome;
    private int[] voti;
    public studente(String nome, String cognome, int[] voti){
        this.nome=nome;
        this.cognome=cognome;
        this.voti=voti;

    }
    public void verificaStudente(){
        int cont=0;
        for(int i=0;i<10;i++){
            if(voti[i]<6){
                 cont++;
            } 
            
        }
        if(cont>=3){
            System.out.println("lo studente "+nome+" "+cognome+" è bocciato");
        }
        else{
            System.out.println("lo studente "+nome+" "+cognome+" è promosso");

        }
    }
    
}