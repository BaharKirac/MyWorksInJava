package aritmetik;
import static javax.swing.JOptionPane.*;
public class Oppgave33 {
    public static void main (String [] args){
        String innLengde = showInputDialog("Skriv inn en lengde:");
        String innBredde = showInputDialog("Skriv inn en bredde:");
        double lengde = Double.parseDouble(innLengde);
        double bredde = Double.parseDouble(innBredde);
        double areal = lengde * bredde;
        System.out.print("Et rektangel med bredde "+bredde+ " cm og lengde "+lengde+" cm");
        System.out.print(" har et areal på "+areal+" cm^2");
    }
}

/*Lag et program som regner ut arealet av et rektangel.
Programmet skal lese inn lengden og bredden på rektangelet.
Regn så ut  arealet og skriver ut svaret på følgende måte:
”Et rektangel med bredde 20.0 cm og
lengde 40.0 cm har et areal på 800.0 cm^2”*/
