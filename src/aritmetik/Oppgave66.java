package aritmetik;
import static javax.swing.JOptionPane.*;
public class Oppgave66 {
    /*public static void main (String  [] args){
        String innEtBeløpDollar = showInputDialog("Skriv inn et beløp dollar");
        double beløpDollar = Double.parseDouble(innEtBeløpDollar);
        double beløpKroner = 10.50;
        double kroner = beløpKroner * beløpDollar;
        System.out.print(beløpDollar+" dollar er lik "+kroner+" nørske kroner");

    }*/

    public static void main(String[]args){
        String innValuta = showInputDialog("Skriv inn antall us-dollar(USD)");
        int valuta = Integer.parseInt(innValuta);
        double norskeKroner = valuta * 10.50;
        System.out.print(valuta+ " USD tilsvarer "+ norskeKroner+ " NOK");
    }
}

/* Lag et program som leser inn et beløp i amerikanske dollar (USD)
 og regner om og skriver ut tilsvarende beløp i norske kroner.
Benytt dagens valutakurs fra nettet */