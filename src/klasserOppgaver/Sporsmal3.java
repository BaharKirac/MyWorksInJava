package klasserOppgaver;

class BensinKjøp {
    private String bensinstasjon;
    private String bensin;
    private double antallLiter;
    private double prisperliter;
    private String tidspunktFylt;

    public BensinKjøp(String bensinstasjon, String bensin, double antallLiter,
                      double prisperliter, String tidspunktFylt){
        this.bensinstasjon = bensinstasjon;
        this.bensin = bensin;
        this.antallLiter = antallLiter;
        this.prisperliter = prisperliter;
        this.tidspunktFylt = tidspunktFylt;
    }

    public String getBensinstasjon(){ return bensinstasjon;}
    public void setBensinstasjon(String bensinstasjon){this.bensinstasjon = bensinstasjon;}

    public String getBensin(){return bensin;}
    public void setBensin(String bensin){this.bensin=bensin;}

    public double getAntallLiter() {
        return antallLiter;
    }
    public void setAntallLiter(double antallLiter){this.antallLiter=antallLiter;}

    public double getPrisperliter() {
        return prisperliter;
    }
    public void setPrisperliter(double prisperliter){this.prisperliter=prisperliter;}
    public String getTidspunktFylt(){return tidspunktFylt;}
    public void setTidspunktFylt(String tidspunktFylt){this.tidspunktFylt=tidspunktFylt;}

    public double finnTotalPrisen(){
return antallLiter * prisperliter;
    }

}

public class Sporsmal3 {
    public static void main(String[]args){
        BensinKjøp etKjøp = new BensinKjøp("Ralingen","95",45,20.45,"11:50");
        double pris = etKjøp.finnTotalPrisen();
        String prisToDesimaler = String.format("%.2f", pris);
        String ut = "Det kostet totalt "+prisToDesimaler+" kr i "+etKjøp.getBensinstasjon()+
                " kl "+etKjøp.getTidspunktFylt();
        System.out.print(ut);

    }
}

/* Lag en klasse kalt BensinKjøp for å representere
informasjon om  kjøp av bensin.
Klassen skal ha 5 private attributter:
Bensinstasjonens sted (en streng)
Type bensin (en streng)
Antall liter fylt (et desimaltall)
Prisen pr. liter (et desimaltall)
Tidspunkt fylt (en streng)
Klassen skal ha en konstruktør som initialiserer
alle attributtene. Lag også get/set metoder for disse.
Lag så en metode finnTotalPrisen.
Denne skal ikke ha noen parametere inn,
men skal returnere prisen som et desimaltall.
Metoden skal da multiplisere antall liter fylt med prisen pr. liter.
Lag så kode i main for å teste ut denne klassen.
Bruk String.format("%.2f", prisen); for å få to desimaler. */