package steinSaksPapir;

import java.util.Random;
import java.util.Scanner;

public class SteinSaksPapir {
    private static Scanner tara;
    public static void main(String[] args) {
        String oyuncu; //* Oyuncunun K, M, T degerlerini tutan degisken
        String bilgisayar = " "; //* PC nin K, M, T, degerlerini tutan degisken
        tara = new Scanner(System.in);
        Random generator = new Random(); //* Rastgele sayi ureteci nesne
        System.out.println("Stein icin T, Papir icin K, Saks icin M gir:");
        //* Bilgisayar icin rastgele bir deger sec (1:T , 2:K, 3:M)
        int pcSayac = generator.nextInt(3) + 1;
        if (pcSayac == 1)
            bilgisayar = "T";
        else if (pcSayac == 2){
            bilgisayar = "K";
        }
        else if (pcSayac == 3){
            bilgisayar = "M";
        }
        //* Oyuncu tercihini klavyeden girerek yapiyor
        System.out.println("Oyuncu ");
        oyuncu = tara.next().toUpperCase(); //* kucuk harf girerse buyuge donustur.
        //* Bilgisayarin tercihini yaz
        System.out.println("Bilgisayar: "+bilgisayar);
        //* ic ice if else ile 9 ihtimal degerlendiriliyor
        if (oyuncu.equals(bilgisayar))
            System.out.println("Berabere! ");
            else if (oyuncu.equals("T")&& bilgisayar.equals("M"))
            System.out.println("Tas makasi kirar. Sen kazandin!");
        else if (bilgisayar.equals("K") && oyuncu.equals("T"))
            System.out.println("Kagit tasi sarar. Bilgisayar kazandi!");
        else if (oyuncu.equals("K")&& bilgisayar.equals("M"))
            System.out.println("Makas kagidi keser. Bilgisayar kazandi!");
        else if (bilgisayar.equals("T") && oyuncu.equals("K"))
            System.out.println("Kagit tasi sarar. Sen kazandin!");
        else if (oyuncu.equals("M")&& bilgisayar.equals("K"))
            System.out.println("Makas kagidi keser. Sen kazandin!");
        else if (bilgisayar.equals("T") && oyuncu.equals("M"))
            System.out.println("Tas makasi kirar. Bilgisayar kazandi!");
        else
            System.out.println("Hatali giris");

    }
}
