package kontrolOppgaverifSwitch;
import static javax.swing.JOptionPane.*;
public class Oppgave2 {
    public static void main(String[] args) {
        String innAlderen = showInputDialog("Skriv inn alderen din");
        int alderenn = Integer.parseInt(innAlderen);

        if (alderenn >= 18){
            showMessageDialog(null, "Du kan ta førerkort for bil da du er gammel nok");

        }
        /*if (alderenn < 18){
            showMessageDialog(null,"Du er for ung til å ta førerkort for bil.");
        }*/
        else {
            showMessageDialog(null,"Du er for ung til å ta førerkort for bil.");
        }
    }
}

/* Les inn en heltallsvariabel "alder".
Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende :

”Du kan ta førerkortet for bil da du er gammel nok” eller
”Du er for ung til å ta førerkort for bil”.

Gjør dette uten bruk av en else-setning (bruk to if-setninger).

Oppgave 3
Gjør oppgave 2 ved hjelp av en else-setning (i tillegg til en if). */