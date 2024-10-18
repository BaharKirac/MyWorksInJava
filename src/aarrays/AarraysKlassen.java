package aarrays;

import java.util.Arrays;

public class AarraysKlassen {
    public static void main(String[] args) {
        double[] liste1 = {1.2,3.5,2.6,-3.6,5.6,10};
        Arrays.sort(liste1); //liste1 dizisi Arrays.sort metodu ile sıralanıyor. Bu metod dizinin elemanlarını küçükten büyüğe sıralar.

        for (double tall : liste1){
            System.out.print(tall+" ");
        }
        double[] liste2 = Arrays.copyOf(liste1, liste1.length); //liste1 dizisinin bir kopyasını oluşturur.
        double[] liste3 = liste2;

        boolean b = Arrays.equals(liste2, liste1); //İki diziyi karşılaştırır.liste1 ve liste2 dizilerinin içerik olarak aynı olup olmadığını kontrol eder.
        int location = Arrays.binarySearch(liste1, 5.6); //sıralı bir dizide verilen değeri (5.6) arar. aranan elemanin indeksini doner.
        System.out.println("\n Indeksen til tallet 5.6 er : "+location);
    }
}
