
//WHILE LØKKER-Dønguler
/* Bir while döngüsü, belirli bir mantıksal koşulun
 doğru olduğu sürece çalışır.
 while (innTall > 0):
Bu ifade şu anlama gelir:
"Değişken innTall 0'dan büyük olduğu sürece döngüyü çalıştır."

Yani, döngüdeki kod parçası,
koşul (innTall > 0) doğru olduğu sürece tekrar tekrar çalıştırılır.
Eğer innTall 0'a eşit veya daha küçük olursa, döngü sonlanır.*/

package løkker;
import javax.swing.*;

import static javax.swing.JOptionPane.*;
public class LøkkeWhle {
    public static void main(String[] args) {
        int sum = 0;
        String innTall = JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med 0 :");
        int input = Integer.parseInt(innTall);
        while (input > 0){
            sum = sum + input;
            innTall = JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med 0 :");
            input = Integer.parseInt(innTall);
        }

        JOptionPane.showMessageDialog(null, "Summen er  : "+ sum);
    }

}
