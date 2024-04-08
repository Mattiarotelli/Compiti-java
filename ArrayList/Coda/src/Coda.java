import java.util.ArrayList;

public class Coda {
    private ArrayList<Integer> coda;

    public Coda(){
        coda = new ArrayList();
    }
    public void Insert (int x){
        coda.add(x);
    }
    public int remove (int i){
        return coda.remove(i);
    }
    public boolean isEmpty(){
        return coda.isEmpty();
    }
}
