package aarrays;

/* Diziyi Parametre Olarak Metoda Geçirmenin Etkisi:
Java'da diziler referans tipi veri yapılarıdır.
Bu, bir diziyi bir metoda parametre olarak gönderdiğinizde
dizinin orijinal hali metodun içinde değiştirilirse,
bu değişiklik orijinal diziye de yansır.
Yani, metodda yapılan değişiklikler ana diziyi de etkiler.

Bu sebeple, skrivArray metoduna liste dizisini gönderdiğinizde,
metodda dizinin ilk elemanını değiştirdiğiniz için
orijinal liste dizisinin ilk elemanı da değiştirilmiş olur. */
public class AarraysSomParameteriMetod {
    private static  int[] liste = {1,2,3,4,5};

    private static void skrivArray(int[]innListe){ //skrivArray metodu bir int[] dizisini parametre olarak alır.
        innListe[0]=200;  // Dizinin ilk elemanı 200 olarak değiştirilir
        for (int tall : innListe){ // Dizinin elemanlarını yazdırır
            System.out.print(tall+ " ");
        }
    }

    public static void main(String[] args) {
        liste[1]=300; // Dizinin ikinci elemanı (liste[1]) 300 olarak değiştirilir
        for (int tall : liste){ // Dizinin elemanlarını yazdırır
            System.out.print(tall+" ");
        }
        System.out.println(); // Bir satır boşluk bırakmak için

        skrivArray(liste); // liste dizisi metoda gönderilir
        System.out.println();

        for (int tall : liste){ // Yeniden dizinin elemanlarını yazdırır
            System.out.print(tall+" ");
        }
    }
}

/* Kod çalıştığında şu adımlar gerçekleşir:

İlk olarak, dizinin ikinci elemanı 300 yapılır ve
dizi ekrana yazdırılır:

1 300 3 4 5

Daha sonra, skrivArray metodu diziyi alır, ilk elemanını 200 yapar ve
ekrana yazdırır:

200 300 3 4 5

Son olarak, ana metodda tekrar diziyi yazdırır ve aynı sonucu görürsünüz,
çünkü dizi metodun içinde değişmiştir:

200 300 3 4 5 */
