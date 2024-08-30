package klasserObjekter;
import static javax.swing.JOptionPane.*;
class Bøker1{
    String tittel;
    double pris;
    String forfatter;
    String iSBN_nummer;

    void skrivUt(){
            String ut = "Tittelen er "+tittel+", Prisen er "+pris+", Forfatter er "+forfatter+", ISBN Nummeret er "+iSBN_nummer+".";
   showMessageDialog(null, ut);
    }
}


public class Oppgave02 {
    public static void main(String [] args){
        Bøker1 bok2 = new Bøker1();
        String tittel = showInputDialog("Tittelen er : ");
        String forfatter = showInputDialog("Forfatteren er : ");
        String innPris = showInputDialog("Prisen er : ");
        String nummer = showInputDialog("ISBN Nummeret er : ");
        double pris = Double.parseDouble(innPris);
        bok2.forfatter = forfatter;
        bok2.tittel = tittel;
        bok2.pris = pris;
        bok2.iSBN_nummer = nummer;
        bok2.skrivUt();

    }
}

//Utvid oppgave 1 til å lese inn de nødvendige dataene fra
// input-bokser og skrive resultatet ut i en meldingsboks.