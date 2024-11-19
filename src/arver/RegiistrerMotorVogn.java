package arver;

import java.util.Date;

class Dato {
    private int dag, måned, år;

    public Dato( int dag, int måned, int år ) {
        this.dag = dag;
        this.måned = måned;
        this.år =år;
    }

    private static String månedsnavn( int mnd ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }

    public String toString(){
        return dag+" "+månedsnavn(måned)+" "+år;
    }
}
class Kjøretøy{
    public String typeBetegnelse;
    public Dato førstegangsRegistert;
    public String kjennetegn;

    public Kjøretøy(String typeBetegnelse, Dato førstegangsRegistert, String kjennetegn) {
        this.typeBetegnelse = typeBetegnelse;
        this.førstegangsRegistert = førstegangsRegistert;
        this.kjennetegn = kjennetegn;
    }
}
class BilA extends Kjøretøy{
    public int lastekapasitet;

    public BilA(String typeBetegnelse, Dato førstegangsRegistert, String kjennetegn, int lastekapasitet) {
        super(typeBetegnelse, førstegangsRegistert, kjennetegn);
        this.lastekapasitet = lastekapasitet;
    }

    @Override
    public String toString() {
        return "BilA{" +
                "lastekapasitet=" + lastekapasitet +
                ", typeBetegnelse='" + typeBetegnelse + '\'' +
                ", førstegangsRegistert=" + førstegangsRegistert +
                ", kjennetegn='" + kjennetegn + '\'' +
                '}';
    }
}

class Motorsykkel extends Kjøretøy{
    public Motorsykkel(String typeBetegnelse, Dato førstegangsRegistert, String kjennetegn) {
        super(typeBetegnelse, førstegangsRegistert, kjennetegn);
    }

    @Override
    public String toString() {
        return "Motorsykkel{" +
                "typeBetegnelse='" + typeBetegnelse + '\'' +
                ", førstegangsRegistert=" + førstegangsRegistert +
                ", kjennetegn='" + kjennetegn + '\'' +
                '}';
    }
}
public class RegiistrerMotorVogn {
    public static void main(String[] args) {
        Kjøretøy[] register = new Kjøretøy[100];
        Dato dato1 = new Dato(1,3,2015);
        BilA volvo = new BilA("Vovlo T5",dato1,"DP23456",450);
        Dato dato2 = new Dato(4,10,2016);

        Motorsykkel ducati = new Motorsykkel("Ducati",dato2,"DR4567");

        register[0]=volvo;
        register[1]=ducati;

        for (Kjøretøy etKjøretøy : register){
            if(etKjøretøy !=null){
                System.out.println(etKjøretøy);
                System.out.println("-----");
            }
    }}
}
