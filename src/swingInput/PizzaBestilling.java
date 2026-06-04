package swingInput;

import static javax.swing.JOptionPane.*;
public class PizzaBestilling {
    public static void main(String[] args) {
        String navn = showInputDialog("Skriv inn navnet ditt : ");

        int pizza;

        String innPizza = showInputDialog("Hvor mange pizza vil du ha?");


        try {
            pizza = Integer.parseInt(innPizza);
        } catch (Exception e){
            pizza = 0;

            showMessageDialog(null, "Ugyldig antall");
        }

        int pris = pizza * 159;

        showMessageDialog(null, "Takk, " + navn + "! Du skal betale " + pris + " kr.");
    }
}
