package strenger;
import static javax.swing.JOptionPane.*;
public class Oppgave5 {
    public static void main (String[] args){
        String fornavn = showInputDialog("Skriv inn fornavn:");
        String etternavn = showInputDialog("Skriv inn etternavn:");
        String alder = showInputDialog("Skriv inn alder:");
        String adresse = showInputDialog("Skriv inn adresse:");
        String poststed = showInputDialog("Skriv inn poststed:");
        String postnummer = showInputDialog("Skriv inn postnummer:");

        String ut = "Navn : "+fornavn+" "+etternavn+"\n"+
                "Alder : "+alder+" år"+"\n"+
                "Adresse : "+adresse+"\n"+
                "Possted : "+poststed+"\n"+
                "Postnummer : "+postnummer+".";
        System.out.print(ut);
    }
}
/*Oppgave 5

Endre oppgave 4 slik at utskriften ikke kommer i en meldingsboks,
men i System.out.*/
