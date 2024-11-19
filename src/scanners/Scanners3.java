package scanners;

import java.util.Scanner;

//Bu örnekte kullanıcıdan üç sınav notu alınır
// ve ortalama hesaplanır.
public class Scanners3 {
    public static void main(String[] args) {
        // Scanner nesnesini oluştur
        Scanner scanner =  new Scanner(System.in);
// Kullanıcıdan üç not alın
        System.out.println("Lutfen birinci sinav notunu girin:");
        double grade1 = scanner.nextDouble();

        System.out.println("Lutfen ikinci sinav notunu girin:");
        double grade2 = scanner.nextDouble();

        System.out.println("Lutfen ucuncu sinav notunu girin:");
        double grade3 = scanner.nextDouble();

        //ortalamayi hesapla
        double average = (grade1+grade2+grade3) / 3;

        // Sonucu ekrana yazdır
        System.out.println("\nNotlarin ortalamasi: "+average);

        scanner.close();

    }
}
