package strenger;
import static javax.swing.JOptionPane.*;

public class Oppgave3 {
    public static void main(String [] args) {
        String fornavn = showInputDialog("Skriv inn fornavn:");
        String etternavn = showInputDialog("Skriv inn etternavn:");
        String alderen = showInputDialog("Skriv inn alderen:");
        String adresse = showInputDialog("Skriv inn adresse");
        String poststed = showInputDialog("Skriv inn poststed");
        String postnr = showInputDialog("Skriv inn postnummer:");
        String navn = fornavn + " " + etternavn;
        showMessageDialog(null, navn + " bor i " + adresse + " som har postnummer " + postnr + " i Oslo. "+ fornavn + " `s alder er "+ alderen + " år.");
    }
}

/*Utvid oppgave 2 med adresse, poststed og postnr.
Les inn dataene i flere inputbox'er og skriv det ut i en setning
f.eks : Ole Olsen bor i Osloveien 23 som har postnummer 0470 i Oslo.
Ole’s alder er 21 år.*/
