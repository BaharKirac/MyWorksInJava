package klasserOppgaver;
import static javax.swing.JOptionPane.*;
class Kontom{
    //  Attributtene for kontoinnehavers navn, kontornummer og saldo.
    private String navn;
    private  String kontonummer;
    private double saldo;
    //  Konstruktør som skal gi startverdier til ALLE attributtene
    public Kontom(String navn, String kontonummer, double saldo) {
        this.navn = navn;
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }
    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */
    public void kontoUtskrift(){
        String ut = "Kontoinnenhaver : "+navn+" \n"+
                "Kontonummer : "+kontonummer +"\n"+
                "Saldo"+String.format("%.2f", saldo)+ " kr";
        showMessageDialog(null,ut);
    }
    /*  Metode som setter inn et beløp på kontoen.
            Beløpets størrelse skal tas imot via en parameter til metoden.
            Metoden skal returnere en tekst som inneholder informasjon om
            den nye saldoen.  */
    public String settInn(double beløp){
        saldo += beløp;
        return "Den nye saldoen er "+String.format("%.2f",saldo);
    }
    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
           at det er dekning for beløpet.
           Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
           Hvis det er dekning på kontoen, skal metoden returnere en tekst
           med informasjon om den nye saldoen. Hvis  det ikke er dekning,
           skal den returnerte teksten inneholde informasjon om det. */
    public String taUt (double beløp){
        String ut = "";
        if (beløp <= saldo ){
            saldo = saldo - beløp;
            ut = "Den nye saldoen er : "+String.format("%.2f",saldo);
        }
        else {
            ut = "Ikke dekning på konto! ";
        }
        return ut;
    }
}
// end of class Konto
public class Sporsmal5 {
    public static void main(String[]args){
        // nødvendige import-setning(er)
        String kontonavn = showInputDialog("Angi kontonavn : ");
        String kontonr = showInputDialog("Angi kontonummer : ");
        double saldo = Double.parseDouble(showInputDialog("Angi saldo :"));
        /*  Opprett et Konto-objekter, som ved opprettelsen blir tilført
        navn, kontonummer og saldo. */
        Kontom sparekonto = new Kontom(kontonavn,kontonr,saldo);
       /*  Test ut ALLE metodene du har laget i Konto-klassen på
        Konto-objektene. Skriv resultatene av metodene ut på System.out.
        Bruk dialogvinduer til både innlesing og utskrift av kontoinformasjon */
        System.out.println(sparekonto.settInn(1000));
        System.out.println(sparekonto.taUt(10));
        System.out.println(sparekonto.settInn(1000));
        // end of class Kontotest
        sparekonto.kontoUtskrift();
        }
    }

