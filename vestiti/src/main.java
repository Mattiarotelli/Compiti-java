import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String type, brand, size, color;
        float price;
        int numeroVestiti = 2;

        capoAbbigliamento[] cA = new capoAbbigliamento[numeroVestiti];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numeroVestiti; i++) {
            System.out.println("inserisci il tipo:");
            type = input.nextLine();
            System.out.println("inserisci la marca:");
            brand = input.nextLine();
            System.out.println("inserisci la taglia:");
            size = input.nextLine();
            System.out.println("inserisci il colore:");
            color = input.nextLine();
            System.out.println("inserisci il prezzo:");
            while (!input.hasNextFloat()) {
                System.out.println("Prezzo non valido riprova:");
                input.next();
            }
            price = input.nextFloat();
            input.nextLine();
            cA[i] = new capoAbbigliamento(type, brand, size, color, price, i + 1);
        }

        input.close();

        for (int i = 0; i < cA.length; i++) {
            cA[i].sconto();
        }
    }
}
