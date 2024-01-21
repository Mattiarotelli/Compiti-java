import java.util.Random;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        String n1, n2, c1, c2;
        int [] v1= new int[10];
        int [] v2 = new int[10];
        Scanner input= new Scanner(System.in);
        n1=input.nextLine();
        n2=input.nextLine();
        c1=input.nextLine();
        c2=input.nextLine();
        input.close();
        Random random=new Random();
        for(int i=0;i<v1.length;i++){
            v1[i]=random.nextInt(10);
            v2[i]=random.nextInt(10);
        }
        studente s1 = new studente(n1, c1, v1);
        studente s2 = new studente(n2, c2, v2);
        s1.verificaStudente();
        s2.verificaStudente();
        

    }
}