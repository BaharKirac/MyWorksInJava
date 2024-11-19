package scanners;
//Scanner – input fra brukere- Kullanıcıdan Giriş (Console)
//Scanner scanner = new Scanner(System.in);
//System.in: Konsoldan (klavye) veri almak için kullanılan standart giriş.

/*Yapı:
Referans türü: Scanner (Scanner sınıfı türünde bir nesne oluşturulur).
Referans ismi: scanner (Scanner nesnesinin adı).
Yeni bir nesne oluşturulur: new Scanner(System.in).
Kullanıcı girişi almak için: System.in (konsoldan veri okur).*/

import java.util.Scanner;

public class Scanners1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner nesnesi oluşturulur
        System.out.println("Skriv inn et tall:");
        int number = scanner.nextInt(); // Kullanıcıdan tam sayı alınır
        System.out.println("Tallet er : "+number);
    }
}
