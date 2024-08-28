package aritmetik;
import static javax.swing.JOptionPane.*;
public class Oppgave44 {
    public static void main (String [] args){
       String innRadius =  showInputDialog("Skriv inn et tall for radius");
       double radius = Double.parseDouble(innRadius);
       double omkrets = 2 * 3.14 * radius;
       String omkretsenMedToDesimaler =  String.format("%.2f" ,omkrets);
       System.out.print("Omkretsen av en sirkel med "+radius+" cm som radius blir "+omkretsenMedToDesimaler+" cm.");
    }
}

/* Lag et program som regner ut omkretsen til en sirkel Les først inn radiusen.
Regn så ut  omkretsen av sirkelen (2*3.14*radius) og skriver ut svaret på følgende måte:
”Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.”
Tips: Bruk String omkretsenMedToDesimaler = String.format("%.2f" , omkretsen); for å få 2 desimaler. */

/* Burada Java dilinde kullanılan String.format metodu ile sayının formatlanması gösterilmektedir.
String.format("%.2f", omkrets) ifadesi, omkrets adlı double türündeki değişkenin,
virgülden sonra iki basamaklı bir ondalık sayı olarak formatlanmasını sağlar.
Yani, omkrets değişkeninin değeri örneğin 125.6789 gibi bir değer olsa bile,
bu formatlama sonucunda sadece 125.68 olarak ekranda gösterilecektir.
Bu, özellikle bir değeri daha okunabilir hale getirmek ve
kesin olmayan ondalık basamakları kırpmak için kullanılır.
Özetle:
%.2f: Bu ifade, sayının virgülden sonra
2 basamak gösterilmesini sağlar.
f: floating point number yani ondalıklı sayı anlamına gelir. */