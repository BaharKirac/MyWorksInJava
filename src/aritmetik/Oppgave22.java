package aritmetik;

public class Oppgave22 {
    public static void main(String [] args){
        int antall = 0; // antall değişkenini tanımla ve 0 olarak başlat
        System.out.print(antall+","); // İlk olarak 0 değerini yazdır

        antall += 2; // antall değişkenini 2 artır, şimdi antall 2 oldu
        System.out.print(antall+","); // antall değerini yazdır, ardından virgül ve boşluk ekle


        antall = antall + 2; // antall değerini 2 artır, şimdi antall 4 oldu
        System.out.print(antall+",");

        antall += 2;
        System.out.print(antall+",");

        antall = antall + 2;
        System.out.print(antall+".");
    }

}

/* Lag et program som definerer en variabel int antall=0.
Skriv så ut partallene mellom 0 og 10 (2,4,6,8)
ved å øke variabelen med 2 mellom hver gang.*/