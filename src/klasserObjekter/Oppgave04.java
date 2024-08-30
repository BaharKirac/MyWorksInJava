package klasserObjekter;
import static javax.swing.JOptionPane.*;
class Person1 {
    String navn;
    String adresse;
    int telefonnr;
    int fødselsår;

    int alder() {
        return 2024 - fødselsår;
    }

    void skrivUt() {
        String ut = "Navn : " + navn + "\n" + "Adresse : " + adresse + "\n" +
                "Telefonnummer : " + telefonnr + "\n" +
                "Alder : " + alder();
        showMessageDialog(null, ut);
    }
}
public class Oppgave04 {

        public static void main(String[]args){

            Person1 person2 = new Person1();
            String navn = showInputDialog("Skriv inn navn ");
            String adresse = showInputDialog("Skriv inn adresse");
            String innTelefonnr = showInputDialog("Skriv inn telefonnumeret");
            String innAlder = showInputDialog("Skriv inn alderen :");
            int telefonnr = Integer.parseInt(innTelefonnr);
            int alder = Integer.parseInt(innAlder);

            person2.navn = navn;
            person2.adresse = adresse;
            person2.telefonnr = telefonnr;
            person2.fødselsår = 2003;
            //int alder = person2.alder();
            person2.skrivUt();
        }
}


/* Utvid oppgave 3 med å lese inn dataene fra input-bokser og
vise resultatet i en meldingsboks på følgende format:

Navn: Per Hansen
Adresse : Osloveien 82
Telefonnr : 22124512
Alder : 21 år.

Tips: bruk \n for å få ny linje */