import java.util.Scanner; 
public class main{
    public static void main(String[] args){
        // Converted pre from String to float
        String ti, ma, ta, co;
        float pre;
        // Created a variable to store the number of clothes
        int numeroVestiti = 2;
        capoAbbigliamento[] cA =  new capoAbbigliamento[numeroVestiti];
        Scanner input = new Scanner(System.in);
        // Changed loop condition from ti.length to numeroVestiti
        for(int i = 0; i < numeroVestiti ; i++){
            System.out.println("inserisci il tipo");
            ti=input.nextLine();
            System.out.println("inserisci la marca");
            ma=input.nextLine();
            System.out.println("inserisci la taglia ");
            ta=input.nextLine();
            System.out.println("inserisci il colore");
            co=input.nextLine();
            System.out.println("inserisci il prezzo");
            pre=input.nextFloat();
            cA[i] = new capoAbbigliamento(ti, ma, ta, co, pre, i+1);

        }
        input.close();
        
        for( int i = 0; i<cA.length; i++){
            cA[i].sconto();
        }
    }
}
