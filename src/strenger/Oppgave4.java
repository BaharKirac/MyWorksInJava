package strenger;
import static javax.swing.JOptionPane.*;
public class Oppgave4 {
    public static void main (String[] args) {
        String fornavn = showInputDialog("Skriv inn fornavn:");
        String etternavn = showInputDialog("Skriv inn etternavn:");
        String adresse = showInputDialog("Skriv inn adresse:");
        String postnummer = showInputDialog("Skriv inn postnummer");
        String poststed = showInputDialog("Skriv inn poststed:");
        String alder = showInputDialog("Skriv inn alder:");
        String ut = "Navn : "+fornavn + " " + etternavn+"\n"+
                "Adresse : "+adresse+"\n"+
                "Postnummer : "+postnummer+"\n"+
                "Poststed : "+poststed+"\n"+
                "Alder : "+alder+" år.";
        showMessageDialog(null, ut);
    }

}

/*Endre oppgave 3 slik at det vises følgende i meldingsboksen (f.eks inndata):

Navn : Ole Olsen
Adresse : Osloveien 23
Postnummer : 0470
Poststed : Oslo
Alder : 21 år.*/