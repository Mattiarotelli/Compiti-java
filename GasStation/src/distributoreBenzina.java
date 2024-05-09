public class distributoreBenzina {
    private double deposito;
    private double prezzoPerLitro;
    distributoreBenzina(double prezzoPerLitro){
        deposito=0;
        this.prezzoPerLitro=prezzoPerLitro;
    }

    public void rifornisci(double quantita){
        deposito+=quantita;
    }

    public void vendi(double euro){
        double litriRifprnimento = euro/prezzoPerLitro;
        if(litriRifprnimento>deposito){
            System.out.println("il deposito non possiede i litri corrispondenti all'importo");
        }else{
            deposito=deposito-litriRifprnimento;
            System.out.println("il rifornimento è stato emesso");
        }
    }

    public void aggiorna(double newPrice){
        prezzoPerLitro=newPrice;
    }
    public double getDeposito(){
        return deposito;
    }
    public double getPrezzoPerLitro(){
        return prezzoPerLitro;
    }

}
