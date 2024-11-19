package scanners;

import java.util.Scanner;

public class ScannersMetodr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi girin");
        if (scanner.hasNextInt()){
            int numberr = scanner.nextInt();
            System.out.println("Girilen sayi : "+numberr);
        }
        else {
            System.out.println("Bu bir tam sayi degildir!");
        }
    }
}

/*Scanner'daki Metotlar
Metotlar:
hasNext(): Bir sonraki girişin olup olmadığını kontrol eder (boolean döner).
hasNextInt(): Bir sonraki girişin bir tam sayı olup olmadığını kontrol eder.
nextInt(): Bir sonraki girişten tam sayı döner.
nextLine(): Bir sonraki tam satırı döner.
next(): Bir sonraki kelimeyi döner.
Kullanım Senaryoları:
hasNextInt() ile kontrol ederek kullanıcının doğru türde veri girdiğinden emin olabilirsiniz.
nextLine() bir satırdaki tüm metni almak için kullanılır.
next() sadece bir kelimeyi döner.
*/