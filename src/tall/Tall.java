package tall;
import javax.swing.*;
public class Tall {
    public static void main (String [] args){
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn et heltall:");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn et heltall til:");
        int tall1 = Integer.parseInt(innStreng1);
        int tall2 = Integer.parseInt(innStreng2);
        int sum = tall1 + tall2;
        System.out.println("Summen til de to tallene er "+sum);
    }
}

/*int tall1 = Integer.parseInt(innStreng1):
Bu satır, kullanıcıdan alınan innStreng1 adlı stringi bir tamsayıya dönüştürür
ve tall1 adlı değişkene atar.
parseInt metodu: parseInt, Integer sınıfının bir statik metodudur.
Bu metot, bir String (metin) olarak verilen bir sayıyı alır ve
bu değeri bir int (tamsayı) olarak döndürür. */