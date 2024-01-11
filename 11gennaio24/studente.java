public class studente{
    private String nome;
    private String cognome;
    private int[] voti;
    class stiudente(String nome, String cognome, int[] voti){
        this.nome=nome;
        this.cognome=cognome;
        this.voti=voti;

    }
    public void verificaStudente(){
        for(int i=0;i<10;i++){
            if(voti[i]<6){
                int cont++;
            } 
            
        }
        if(cont>3){
            System.out.pritln("lo studente è bocciato")
        }
    }
    
}