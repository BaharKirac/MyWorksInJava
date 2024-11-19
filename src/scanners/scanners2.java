package scanners;

import java.util.Scanner;

public class scanners2 {
    public static void main(String[] args) {
        // Scanner nesnesini oluştur
        Scanner  scanner = new Scanner(System.in);
        // Kullanıcıdan isim alın
        System.out.println("Lutfen adinizi girin:");
        String name = scanner.nextLine(); // Kullanıcının tam adını alır
        // Kullanıcıdan yaş alın
        System.out.println("Lutfen yasinizi girin:");
        int age = scanner.nextInt(); // Kullanıcının yaşını alır
        // nextInt() sonrası satır sonunu temizle
        scanner.nextLine();
        // Kullanıcıdan favori kelimesini alın
        System.out.println("Lutfen favori kelimenizi girin");
        String favoritord = scanner.nextLine(); // Kullanıcının favori kelimesini alır
        // Girilen bilgileri ekrana yazdır
        System.out.println("\nGirilen bilgiler:");
        System.out.println("Ad: "+name);
        System.out.println("Age: "+age);
        System.out.println("Favori kelime: "+favoritord);
        // Kaynak sızıntısını önlemek için Scanner'ı kapat
        scanner.close();
    }
}
