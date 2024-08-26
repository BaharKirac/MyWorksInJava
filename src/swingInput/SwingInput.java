package swingInput;
import  javax.swing.*;
public class SwingInput {
    public static void main (String [] args) {
        String navn = JOptionPane.showInputDialog("Hva heter du?");
        System.out.print(navn);
    }
}

//import javax.swing.*;: Java'nın Swing kütüphanesini içe aktarır.
// Swing, grafiksel kullanıcı arayüzü (GUI) elemanları oluşturmak için kullanılan bir kütüphanedir.
//String navn = JOptionPane.showInputDialog("Hva heter du?");:
// Bu satırda JOptionPane.showInputDialog metodu kullanılarak bir girdi penceresi açılır
// ve kullanıcıya "Hva heter du?" (Türkçesi: "Adın ne?") sorusu sorulur.
// Kullanıcı bu soruya cevap verdiğinde, girilen değer navn adlı String değişkenine atanır.
//Burada System.out.print metodu kullanılmış, bu da yeni bir satıra geçmeden sadece değeri yazdırır.