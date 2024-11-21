package plenums;
import static javax.swing.JOptionPane.*;
public class Plenum4 {
    public static void main(String[] args) {
        int tall1 = 2;
        int tall2 = 4;

        int sum= tall1 + tall2;
        int subtraksjon = tall1 - tall2;
        int multiplikasjon = tall1 * tall2;
        int divisjon = tall1 / tall2;
        int resultat = tall1*tall2-tall1+(tall1+tall2)/tall1;
        //System.out.println(resultat);

        int tallA = 40_000;
        double tallB = 3;
        double divisjon1 =  tallA/tallB;
        //System.out.println(divisjon1);
// modulus
        // dele epler
        String innEpler = showInputDialog("Et antall epler skal deles på et antall personer\nSkriv antall epler");
        String innPersoner = showInputDialog("som skal deles på antall personer:");
        int antallEpler = Integer.parseInt(innEpler);
        int antallPersoner = Integer.parseInt(innPersoner);
        double antallEplerPerPerson = antallEpler / antallPersoner;
        double antallPersonerDesimal = Double.parseDouble(innPersoner);
        double antallEplerPerPersonDesimal = antallEpler / antallPersonerDesimal;
        showMessageDialog(null,"Antall epler pr person : "+antallEplerPerPerson);
        showMessageDialog(null,"Antall epler pr person desimal : "+antallEplerPerPersonDesimal);
// finne resten av eplene (modulus)
        int antallRest = antallEpler % antallPersoner;
        showMessageDialog(null,"Antall epler igjen :"+antallRest);



    }
}
