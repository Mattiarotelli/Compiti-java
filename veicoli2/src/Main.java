import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Auto[] a = new Auto[10];
        String m, p,t;
        System.out.println("Hello world!");
        Scanner s1 = new Scanner(System.in);
        for(int i = 0; i <a.length; i++){
            m = s1.next();
            p = s1.next();
            t = s1.next();
            a[i] = new Auto(m,p,t);
        }
        for( int i = 0; i < a.length; i++){
            a[i].Print();
        }





    }
}