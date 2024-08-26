package tall;

import javax.swing.*;

public class Oppgave1 {
    public static void main(String []args){
        String innAlder = JOptionPane.showInputDialog("Skriv inn alderen din:");
        int alder = Integer.parseInt(innAlder);
        JOptionPane.showMessageDialog(null,"Min alder er "+alder+" år.");
    }
}

/* Lag et program som leser inn alderen din (et heltall).
Vis så denne i en meldingsbox sammen med en tekst f.eks som
 ”Min alder er 19 år.” */
//Innlesing skjer alltid i form av en tekststreng.