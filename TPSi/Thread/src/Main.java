public class Main{
    public static void main(String[] args) throws InterruptedException {
        GlobalStruct dati = new GlobalStruct();
        Thread t1 = new Thread(new Somma1(dati));
        Thread t2 = new Thread(new Somma2(dati));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.print("Valore finale di A:"+dati.datoA);
        System.out.print("Valore finale di A:"+dati.datoB);


    }
}