package eksamenns;

public class Ingrendient {
    private String name;
    private  double amount;
    private String unit;

    public Ingrendient(String name, double amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }


    @Override
    public String toString(){
        return amount + " " + unit + " " + name;
    }
}
