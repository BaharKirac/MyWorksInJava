/* Lag et program som leser inn en persons fornavn og etternavn hver for seg
(altså i to forskjellige input-bokser),
 skjøter dem sammen, og skriver det fullstendige navnet ut igjen
  som del av en passende tekst i en meldingsboks.
  Bruk passende ledetekster ved innlesing,
  slik at brukeren forstår hva som skal skrives inn.  */


package strenger;
import javax.swing.*;
public class Oppgave1 {
    public static void main(String[] args) {
        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavn:");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavn:");
        String navn = fornavn + " " + etternavn;
        JOptionPane.showMessageDialog( null,navn);

    }
}
/*Statik import kullanarak (eğer import static javax.swing.JOptionPane.*; ifadesini kullanıyorsanız):

Bu durumda showMessageDialog doğrudan kullanılabilir.
JOptionPane sınıfıyla birlikte (eğer statik import kullanmıyorsanız):

Bu durumda showMessageDialog metodunu JOptionPane.showMessageDialog olarak çağırmanız gerekir.*/