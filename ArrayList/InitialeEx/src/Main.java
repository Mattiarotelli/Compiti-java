import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int x;
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> v = new ArrayList<Integer>(10);
        for (int i = 0; i < 10;i++){
            System.out.println("inserisci");
            x = s.nextInt();
            v.add(x);
        }
        int o = 0;
        //sostituisce il numero in pos 4 con 0 e inserisce in x il numero che c'era prima
        x = (int) v.set(4, o);
        System.out.println("numero nuovo: "+o+" numero vecchio: "+x);
    }
}