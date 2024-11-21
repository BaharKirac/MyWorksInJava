package exceptionHandling;

import static javax.swing.JOptionPane.*;
public class ExceptionEksemples {
    public static void main(String[] args) {
        double tall;
        String innStreng = showInputDialog("Skriv inn et tall");

        try {
            tall = Double.parseDouble(innStreng);
        }
        catch (Exception e){
            tall = 0;
        }
        System.out.println(tall * 2);
    }
}

// man kunne egentlig ha satt tall = 0 som default i dette eksempelet.