public class Somma2 implements Runnable{
    private GlobalStruct d2;
    Somma2(GlobalStruct d){
        d2=d;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            d2.datoB++;
        }
    }
}
