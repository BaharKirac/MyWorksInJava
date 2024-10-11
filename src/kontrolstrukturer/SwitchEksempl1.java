package kontrolstrukturer;
import static javax.swing.JOptionPane.*;
public class SwitchEksempl1 {
    public static void main(String[] args) {
        double resultat = 0;
        double tall1 = Double.parseDouble(showInputDialog("Skriv inn tall 1 : "));
        String regneart = showInputDialog(" + , - , * , / ");
        double tall2 = Double.parseDouble(showInputDialog("Skriv inn tall2 : "));
//switch ile
        switch (regneart){
            case "+":
                resultat = tall1 + tall2;
                break;
            case "-":
                resultat = tall1 - tall2;
                break;
            case "*":
                resultat = tall1 * tall2;
                break;
            case "/":
                resultat = tall1 / tall2;
                break;
            default:
                resultat = 0;
                break;
        }

        showMessageDialog(null, "Resultat av regnestykket ble : "+tall1+" "+regneart+" "+tall2+" = "+resultat);

        //if ile

        /* if (regneart.equals("+")){
            resultat = tall1 + tall2;

            //  iki string'in içeriklerini (değerlerini)
            //  karşılaştırmak için equals() metodu kullanılır.
            //Java'da bir string (metin) karşılaştırma işlemidir
            //equals() metodu ile regneart değişkeninin içeriği
            // belirli bir string ile (örneğin "+", "-", "*", "/") karşılaştırılır.
        }

        if (regneart.equals("-")){
            resultat =  tall1 - tall2;

        }
        if (regneart.equals("*")){
            resultat =  tall1 * tall2;

        }
        if (regneart.equals("/")){
            resultat =  tall1 / tall2;

        }
        showMessageDialog(null, "Resultat av regnestykket ble: "+tall1+" "+regneart+" "+tall2+" = "+resultat); */
    }
}
