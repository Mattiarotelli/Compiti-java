import java.util.Scanner; 
public class main{
    public static void main(String[] args){
        String ti, ma, ta, co, pre;
        capoAbbigliamento[] cA =  new capoAbbigliamento[2];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < ti.length ; i++){
            System.out.println("inserisci il tipo");
            ti=input.nextLine();
            System.out.println("inserisci la marca");
            ma=input.nextLine();
            System.out.println("inserisci la taglia ");
            ta=input.nextLine();
            System.out.println("inserisci il colore");
            co=input.nextLine();
            System.out.println("inserisci il prezzo");
            pre=input.nextInt();
            cA[i] = new capoAbbigliamento(ti, ma, ta, co, pre, i+1);
        }
        input.close();
        
        for( int i = 0; i<cA.length; i++){
            cA[i].sconto();
        }
    }
}
