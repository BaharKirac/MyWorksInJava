package klasserObjekter2;

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
//toString metode
    public String toString(){
        return dag+" "+månedsnavn(måned)+" "+år;
    }
}

class Bil1{
    // opprett følgende attributter
    // typebetegnelse f.eks Audi A6
    // førstegangsregistrert av type Dato
    // kjennetegn dvs. skiltnummer

    // lag også konstruktør for alle attributtene

    // lag så en toString metode for å vise alle attributtene
    public String typeBetegnelse;
    public Dato førstegangsRegistert;
    public String kjennetegn;
//konstruktør
    public Bil1(String typeBetegnelse,Dato førstegangsRegistrert, String kjennetegn){
        this.typeBetegnelse = typeBetegnelse;
        this.førstegangsRegistert = førstegangsRegistrert;
        this.kjennetegn = kjennetegn;
    }
//toString metode
    public String toString(){
        String ut = "Typebetegnelse : "+typeBetegnelse+"\n"+
                "Første gangs registreringsdato : "+førstegangsRegistert+"\n"+
                "Kjennetegn : "+kjennetegn;
        return ut;
    }
}
public class MotorVogn {
    public static void main(String[] args) {
        // opprett et array av Biler
        Bil1 [] register = new Bil1 [100];
// Sett inn noen biler i arrayet
        Dato dato1 = new Dato(1,3,2015);

        Bil1 volvo = new Bil1("Volvo T5",dato1,"DP23456");

        Dato dato2 = new Dato(4,10,2016);

        Bil1 audi = new Bil1("Audi R8",dato2,"DR45678");

        register[0]=volvo;
        register[1]=audi;
        // List motorvognregisteret (arrayet) ved hjelp av en løkke
        for (Bil1 enBil : register){
            if(enBil !=null){
                System.out.println(enBil);
                System.out.println("-----");
            }
        }
    }
}
