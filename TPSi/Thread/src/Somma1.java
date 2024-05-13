public class Somma1 implements Runnable{
    private GlobalStruct d1;
    Somma1(GlobalStruct d){
        d1=d;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            d1.datoA++;
        }
    }
}
