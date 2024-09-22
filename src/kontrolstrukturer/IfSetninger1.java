package kontrolstrukturer;

import javax.swing.*;

public class IfSetninger1 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Fyll inn alderen din : ");
        int alder = Integer.parseInt(input);

        if (alder < 13){
            JOptionPane.showMessageDialog(null,"Du er et barn!");
        }
        else if (alder < 18){
            JOptionPane.showMessageDialog(null,"Du er ungdom!");
        }
        else if (alder < 70){
            JOptionPane.showMessageDialog(null,"Du er voksen!");
        }
        else {
            JOptionPane.showMessageDialog(null,"Du er pensjonist!");
        }

        /* String input = JOptionPane.showInputDialog("Fyll inn alderen din : " );
        int alder = Integer.parseInt(input);

        if(alder < 13){
           JOptionPane.showMessageDialog(null,"Du er bare et barn");
        }
        if (alder >= 13 && alder < 18){
            JOptionPane.showMessageDialog(null,"Du er ungdom");
        }
        if (alder >= 18 && alder < 70){
            JOptionPane.showMessageDialog(null,"Du er voksen");
        }
        if (alder >= 70){
           JOptionPane.showMessageDialog(null,"Du er pensjonist");
        }
        String ut = alder >= 18 ? "Du er voksen" : "Du er ikke voksen";
        JOptionPane.showMessageDialog(null,ut);  */
    }
}

/* Et program skal lese inn en alder (heltall) og
så skal det skrive ut en tekst avhengig av alderen:

Du er et barn ( mindre enn 13 år)
De er en ungdom (mellom 13 og 18 år)
Du er voksen (mellom 18 og 70 år)
Du er pensjonist (over 70 år).
 */

/* else if yapısının işlevi,
belirli bir koşulun doğru olup olmadığını kontrol etmektir.
Eğer if koşulu doğru değilse, program sıradaki else if koşuluna geçer ve
 bu koşulu kontrol eder.
Eğer bu koşul doğruysa, ona karşılık gelen kod bloğu çalıştırılır.
Her bir else if farklı bir koşulu kontrol eder.
Program, kullanıcıya uygun mesajı verebilmek için
yaş aralıklarını bu koşullarla denetler.
Program bir koşulu doğru bulduğunda,
o koşulun altındaki kodu çalıştırır ve
kalan else if veya else bloklarına bakmaz.
*/