package aarraysOppgaver;

/* Oppgave 5
Bruk arrayet i oppgave 4 og skriv kode for å finne
det største og minste tallet i arrayet via en løkke.
Tips: Sett største og minste tallet
til første elementet i arrayet før løkken. */
public class Oppgaver_5 {
    public static void main(String[] args) {
        int [] liste = {45, 34, 5, 8, 10, 2, 13, 25};
        int største = liste[0];
        int minste = liste[0];

        for (int i : liste){ //liste dizisindeki her eleman sırayla i değişkenine atanarak döngüde işlenir.
            if (i>største){
                største = i;
            }
            if (i<minste){
                minste =i;
            }
        }

        System.out.println("Det største tallet er "+største);
        System.out.println("Det minste tallet er "+minste);
    }
}
/* for-each döngüsü ile dizi boyunca ilerlenir.
Her eleman hem en büyük hem de en küçük sayı ile karşılaştırılır.
Eğer yeni bir büyük ya da küçük değer bulunursa, ilgili değişken güncellenir.
Döngü sonunda, bulunan en büyük ve en küçük değerler yazdırılır.
for-each" yapısında indeks kullanmaya gerek kalmaz ve
doğrudan elemanları gezersiniz.*/