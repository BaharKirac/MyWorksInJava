package arver;

class Kjoretoy{
    protected int tankVolum;
    protected int antallHjul;
    protected String farge;

    public Kjoretoy(int tankVolum, int antallHjul, String farge) {
        this.tankVolum = tankVolum;
        this.antallHjul = antallHjul;
        this.farge = farge;
    }
    public Kjoretoy() {
    }
}

class Araba extends Kjoretoy{
    protected int antallDører;

    public Araba(int tankVolum, int antallHjul, String farge, int antallDører) {
        super(tankVolum, antallHjul, farge);
        this.antallDører = antallDører;
    }
    public Araba() {
    }
}

class Lastebill extends Araba{
    protected double lastekapasitet;

    public Lastebill(int tankVolum, int antallHjul, String farge, int antallDører, double lastekapasitet) {
        super(tankVolum, antallHjul, farge, antallDører);
        this.lastekapasitet = lastekapasitet;
    }
    public Lastebill() {
    }
}

class Motorsiklet extends Kjoretoy{

    // ingen nye attributter
    public Motorsiklet(int tankVolum, int antallHjul, String farge) {
        super(tankVolum, antallHjul, farge);
    }
    public Motorsiklet() {
    }
}
public class ArvEksmpl2 {
    public static void main(String[] args) {
        Lastebill enLastebil = new Lastebill(1000,6,"Hvit",2,50);

         // først uten konstruktører, så med!
       /* Lastebill enLastebil = new Lastebill();
        enLastebil.antallHjul=4;
        enLastebil.antallDører=2;
        enLastebil.lastekapasitet=50;

Araba enAraba = new Araba();
enAraba.farge= "Blå";
enAraba.antallDører=5;

        Motorsiklet enMotorsykkel = new Motorsikletl();
        enMotorsykkel.antallHjul = 2;

        Kjoretoy etKJøreeTøy = new Kjoretoy();
        etKJøreeTøy.farge = "Grønn"; */
        System.out.println("Lastebilen har "+enLastebil.antallDører+ " dører.");
        System.out.println("Lastebil oluşturuldu: " + enLastebil.farge+" farge.");
        System.out.println("Lastebilen lastekapasitet er "+enLastebil.lastekapasitet);
    }
}
