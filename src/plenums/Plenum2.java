package plenums;
import java.text.MessageFormat;
import java.util.Scanner;

import static javax.swing.JOptionPane.*;

//input og output bokser
public class Plenum2 {
    public static void main(String[] args) {
        String innNavn = showInputDialog("Skriv inn navnet ditt:");
        String innAdresse =  showInputDialog("Skriv inn adressen din: ");
        String innPostNr = showInputDialog("Skriv inn postnummeret ditt: ");
        String innPostAdresse = showInputDialog("Skriv inn postadressen din: ");

        //showMessageDialog(null, innNavn+ " har adressen "+innAdresse);

        //String ut = "Navnet : "+innNavn+"\nAdressen : "+innAdresse+"\nPostnummer : "+innPostNr+"\nPostadressen : "+innPostAdresse;

        //showMessageDialog(null,ut);
        //System.out.println(ut); //ayni zamanda konsolda da cikti gostermek icin ut stringi tanimlayip sout ile yapabiliriz.

        //scanner yontemi ile girdi cikti
       Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv inn ditt navn:");
        String navn = scanner.nextLine();
        System.out.println("navnet ditt er: "+navn);

        String output = MessageFormat.format("Navnet : {0}\n Adressen : {1} {2} \n {3}", innNavn,innAdresse,innPostNr,innPostAdresse);
        showMessageDialog(null, output); //dialog boks olarak da gosteriyor konsoldan sonra



    }
}
