public class Docente extends Persona {
    private double salary;
    private String matter;
    public Docente(String name, String surname, String fiscalCode, double salary, String matter){
        super(name, surname, fiscalCode);
        this.salary = salary;
        this.matter = matter;
    }
    public double getSalary() { return salary; }
    public String getMatter() { return matter; }
    public void setSalary(double x) { salary = x; }
    public void setMatter(String x) { matter = x; }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println(" Salario: "+salary+" Materia: "+ matter);
    }
}
