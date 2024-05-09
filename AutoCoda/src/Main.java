import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Auto x = new Auto("Aygo","De439Xt","Toyota");
        Auto z = new Auto("Cooper","Ge439Xt","Toyota");
        AutoCoda coda = new AutoCoda();
        int tipoIntervento;

        System.out.println("Per inserire premere 1");
        System.out.println("Per servire premere 2");
        System.out.println("Per sapere i rimasti premere 3");
        Scanner input = new Scanner(System.in);
        tipoIntervento=input.nextInt();
        switch (tipoIntervento){
            case 1:{
                coda.Inserisci(x);
                coda.Inserisci(z);
            }
            case 2:{
                coda.servi();
            }
            case 3: {
                System.out.println(coda.quantita());
            }
        }
    }
}