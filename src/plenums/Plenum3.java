package plenums;
import static javax.swing.JOptionPane.*;
public class Plenum3 {
    public static void main(String[] args) {
        /* int alderPer = 23;
        int alderLine, sumAlder;
        alderLine = 22;
        sumAlder = alderLine + alderPer;
        //System.out.println("Summen av alderen til Per og Line er "+sumAlder);

        //med input og output bokser
        String innNavn = showInputDialog("Skriv inn navnet");
        String innAlder = showInputDialog("Skriv inn alder");
        int alder = Integer.parseInt(innAlder);
        int fødselsår = 2024-alder;

        showMessageDialog(null, innNavn+" er født "+fødselsår);
        System.out.println(fødselsår); */

        //desimaltall

       /* String innString1 = showInputDialog("Skriv inn et desimaltall:");
        String innString2 = showInputDialog("Skriv inn et desimaltall til ");
        double inntall1 = Double.parseDouble(innString1);
        double inntall2 = Double.parseDouble(innString2);
        double divisjon =  inntall1 / inntall2;

        showMessageDialog(null,inntall1+" delt på "+inntall2+" blir "+divisjon); */

        //heltall

        /*String innString3 = showInputDialog("Skriv inn et heltall");
        String innString4 = showInputDialog("Skriv inn et heltall til");
        int tall3 = Integer.parseInt(innString3);
        int tall4 = Integer.parseInt(innString4);
        int divisjon1 = tall3 / tall4;
        showMessageDialog(null,tall3+" delt på "+tall4+" blir "+divisjon1);*/

        // kode for å unngå feil i innlesning / konvertering til tall

        double tall;
        String innStreng = showInputDialog("Skriv inn et tall");
        try {
            tall = Double.parseDouble(innStreng);
        }
        catch (Exception e){
            tall = 0;
        }
        showMessageDialog(null,"Tallet er nå "+ tall);
        }
    }

