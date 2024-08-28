package aritmetik;
import static javax.swing.JOptionPane.*;
public class Oppgave10 {
    public static void main (String[]args){
        String innAlder = showInputDialog("Skriv inn alder");
        int alder = Integer.parseInt(innAlder);

        if (alder < 18 ) {

            showMessageDialog(null,"Du er for ung til å ta førerkort for bil");
            System.out.println("Du er for ung til å ta førerkort for bil");
        }

        if (alder >= 18) {
            showMessageDialog(null,"Du er gammel nok for å ta førerkort");
            System.out.println("Du er gammel nok for å ta førerkort");
        }
    }
}

/* Lag et program som leser inn et heltall, alder.
Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende:
”Du kan ta førerkortet for bil da du er gammel nok” eller
”Du er for ung til å ta førerkort for bil”.
Gjør dette ved bruk to if-setninger. */