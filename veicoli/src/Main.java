public class Main{

    public static void main(String[] args) {
        veicoliMotore macchina = new veicoliMotore(220.213f, "Macchina", 213621531, 3.56f, false);
        macchina.accendi();
        System.out.println("lo stato del veicolo è: " + macchina.getStato());
    }
}
