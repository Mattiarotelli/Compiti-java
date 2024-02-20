import java.util.Scanner;

public class City {
    protected String name;
    protected int pop;
    protected int[][] temp;
    public City(String name, int pop, int temp[][]){
        this.name = name;
        this.pop = pop;
        this.temp = temp;
    }
    public void setPop(int pop) {
        this.pop = pop;
    }
    public void riemTemp(){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 12; i++){
            for(int c = 0; c < 3; c++){
                temp[i][c] = in.nextInt();
            }
        }
    }
}
