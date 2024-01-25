public class Persona {
    protected String name;
    protected String surname;
    protected String fiscalCode;
    public Persona(String name, String surname, String fiscalCode){
        this.name = name;
        this.surname = surname;
        this.fiscalCode = fiscalCode;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getFiscalCode(){
        return fiscalCode;
    }
    public void setName(String x){
        name = x;
    }
    public void setSurname(String x){
        surname = x;
    }
    public void setFiscalCode(String x){
        fiscalCode = x;
    }
    public void stampa(){
        System.out.println("Nome: "+name+" Cognome: "+surname+" Codice Fiscale: "+fiscalCode);
    }

}
