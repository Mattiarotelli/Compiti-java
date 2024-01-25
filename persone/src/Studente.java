public class Studente extends Persona {
    private int badgeNumber;
    private String uni;
    public Studente(String name, String surname, String fiscalCode, int badgeNumber, String uni){
        super(name, surname, fiscalCode);
        this.badgeNumber = badgeNumber;
        this.uni = uni;
    }
    public int getBadgeNumber(){
        return badgeNumber;
    }
    public String getUni(){
        return uni;
    }
    public void setBadgeNumber(int x) { badgeNumber = x; }
    public void setUni(String x) { uni = x; }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println(" Matricola: "+badgeNumber+" Universita' "+uni);
    }

}
