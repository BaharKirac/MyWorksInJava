package strenger;

import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    public static void main (String[] args) {
        String fornavn = showInputDialog("Skriv inn fornavn:");
        String etternavn = showInputDialog("Skriv inn etternavn:");
        String alderen = showInputDialog("Skriv inn alderen:");
        String navn = fornavn + " " + etternavn;
        showMessageDialog( null,"Alderen til "+ navn +" er "+alderen+" år" );
    }
}

/*Utvid oppgave 1 med å lese inn alderen.
Programmet skal så vise følgende i meldingsboksen (f.eks inndata):
  ”Alderen til Ole Olsen er 21 år.”*/

//På en annen måte
   /* String fornavn = showInputDialog("Skriv inn fornavn:");
    String etternavn = showInputDialog("Skriv inn etternavn:");
    String alderen = showInputDialog("Skriv inn alderen:");
    String navn = fornavn + " " + etternavn;
    String ut = "Alderen til "+ navn +" er "+alderen+" år";
    showMessageDialog( null, ut);*/
