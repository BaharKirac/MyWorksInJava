package aarraysOppgaver;

/* Oppgave 3
Gitt følgende string-array :
Per, Hansen, Line, Olsen, Ola, Pedersen, Kari, Finnsen.
Skriv så ut for og etternavn på flere linjer med en løkke
som vist under:

Per Hansen
Line Olsen */
public class Oppgaver_3 {
    public static void main(String[] args) {
        String[] names = {"Per", "Hansen", "Line", "Olsen", "Ola", "Pedersen", "Kari", "Finnsen"};
//Burada, isim ve soy isimlerin bulunduğu bir String array tanımlanıyor.
        for (int i = 0; i < names.length; i += 2) {
            System.out.println(names[i] + " " + names[i + 1]);
//i indeksinde bulunan isim ve i + 1 indeksinde bulunan soyisim birleştirilerek yazdırılıyor
        }
    }
}

/* for döngüsü kullanılarak dizide geziniliyor.
i += 2 ifadesi sayesinde döngü her seferinde ikişer eleman atlayarak ilerliyor.
Böylece dizinin çift indekslerinde (0, 2, 4, 6) yer alan isimler ve
hemen ardından gelen tek indekslerdeki soyisimler işleniyor. */

/* i = 0 olduğunda, "Per Hansen" yazdırılır.
i = 2 olduğunda, "Line Olsen" yazdırılır.
Bu döngü tüm diziyi bitirene kadar devam eder. */