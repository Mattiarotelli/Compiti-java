import java.util.Scanner; 
public class main{
    public static void main(String[] args){
        String ti[] = new String[2];
        String ma[] = new String[2];
        String ta[] = new String[2]; 
        String co[] = new String[2]; 
        int pre[] = new int[2]; 
        capoAbbigliamento[] cA =  new capoAbbigliamento[2];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < ti.length ; i++){
            
            System.out.println("inserisci il tipo");
            ti[i]=input.nextLine();
            System.out.println("inserisci la marca");
            ma[i]=input.nextLine();
            System.out.println("inserisci la taglia ");
            ta[i]=input.nextLine();
            System.out.println("inserisci il colore");
            co[i]=input.nextLine();
            System.out.println("inserisci il prezzo");
            pre[i]=input.nextInt();
            cA[i] = new capoAbbigliamento(ti, ma, ta, co, pre);
            
            
        }
        input.close();
        
        

        for( int i = 0; i<cA.length; i++){
            cA[i].sconto(30);
        }

        
    }
}
