package aritmetik;
import static javax.swing.JOptionPane.*;
public class Oppgave11 {
    public static void main (String [] args){
        String navn = showInputDialog("Skriv inn navnet:");
        String innAlder = showInputDialog("Skriv inn alderen:");
        int alder = Integer.parseInt(innAlder);
        int fødselsår = 2023 - alder;
        int pensjonsår = fødselsår + 67;
        System.out.print(navn+ " er i dag "+ alder+ " år.Han er født i "+fødselsår);
        System.out.print(" I "+pensjonsår+ " er han 67 år og da vil han være pensjonist.");

    }
}
/*Les inn to variabler; navn, alder.
Skriv så følgende historie (et eksempel):
Per Olsen er i dag 32 år. Han er født i 1986.
I 2053 er han 67 år og da vil han være pensjonist.*/