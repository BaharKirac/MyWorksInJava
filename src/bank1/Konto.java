package bank1;

public class Konto {
    private String personnumer;
    private String navn;
    private double saldo;

    //Konstruktør olustur

    public Konto(String personnumer, String navn, double saldo) {
        this.personnumer = personnumer;
        this.navn = navn;
        this.saldo = saldo;
    }

    public String getPersonnumer() {
        return personnumer;
    }

    public void setPersonnumer(String personnumer) {
        this.personnumer = personnumer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
