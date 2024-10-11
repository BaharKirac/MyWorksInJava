package kontrolOppgaverifSwitch;
import static javax.swing.JOptionPane.*;
public class Oppgave5a {
    public static void main(String[] args) {
        String innMåned = showInputDialog("Skriv inn en måned for eks. mars");

        if (innMåned.equals("juni") || innMåned.equals("juli") || innMåned.equals("august")){
            showMessageDialog(null,"Det er sommer");
        }
        else if (innMåned.equals("september") || innMåned.equals("october") || innMåned.equals("november"))
            {
                showMessageDialog(null, "Det er høst");
            }

        else if (innMåned.equals("desember") || innMåned.equals("januar") || innMåned.equals("februar")) {
                showMessageDialog(null, "Det er vinter");
            }
        else if (innMåned.equals("mars") || innMåned.equals("april") || innMåned.equals("mai")) {
            showMessageDialog(null, "Det er vår");
        }
        else {
            showMessageDialog(null,"Det er ikke en gyldig måned.");
        }
        }
}

/* Lag et program som leser inn et månedsnavn.
Så skal programmet skrive ut hvilken årstid det er. Reglene er:

Sommer : juni, juli, august
Høst : september, oktober, november
Vinter: desember, januar, februar,
Vår : mars, april, mai,
a) Lag først et program som løser det med if /else

b) Lag deretter et program som løser det med bruk av switch. */