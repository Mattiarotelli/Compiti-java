import java.util.ArrayList;
import java.util.Scanner;

public class Pila {
    private ArrayList<Integer> pila;
    public Pila (){
        pila = new ArrayList<Integer>();
    }
    public  void push(int n){
        pila.add(n);
    }
    public int pop(){
        if(!pila.isEmpty()){
            return pila.remove(pila.size()-1);
        }else{
            System.out.println("la pila è vuota");
            return -1;
        }
    }
    public boolean IsEmpty(){
        return pila.isEmpty();
    }
}