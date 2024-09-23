package kontrolstrukturer;

public class Switchsetng {
    public static void main(String[] args) {
        int gün = 3;
        switch (gün) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz gün");
                break;
        }

    }
}

/* SWITCH
bir değişkenin değerine göre
 birden fazla durumu (case) kontrol etmek ve
belirli kod bloklarını çalıştırmak için kullanılan
bir kontrol yapısıdır.

switch Yapısının Avantajları:

Kodun okunabilirliğini artırır
Özellikle birden fazla if-else if durumu olduğunda,
switch yapısı daha sade ve okunaklı olur.

switch (değer) {
    case sabit_değer1:
        // sabit_değer1 durumunda çalışacak kod
        break;
    case sabit_değer2:
        // sabit_değer2 durumunda çalışacak kod
        break;
    ...
    default:
        // Hiçbir case ile eşleşmediğinde çalışacak kod
        break;
}
*/