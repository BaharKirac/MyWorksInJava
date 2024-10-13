package løkker;

public class LøkkeFor {
    public static void main(String[] args) {
        int i = 0;
        while (i <10){
            System.out.print(i);
            i++;
        }

        for (int j = 0; j<10;j++)
            System.out.println(j+" ");
    }
}

/*  for ( < initialisering >; < test >; < oppdatering > )
    < instruksjon(er) >

    Bir for döngüsü ise belirli bir sayıda tekrar edilmek üzere
    önceden belirlenmiştir.
    Bu, döngünün kaç kez çalışacağını en baştan bildiğimiz anlamına gelir.
    Burada başlatma olarak adlandırılan şey genellikle
    bir sayım değişkeninin başlatılmasıdır.
    Test genellikle sayma değişkeninin maksimum değerine
     (veya minimum değerine) ulaşıp ulaşmadığının testidir.
     Güncelleme, sayım değişkenini artırıyor (veya azaltıyor).
     Döngüdeki her geçiş için birden fazla talimatın yürütülmesi gerekiyorsa,
    talimatları (tabii ki!) blok parantez içine almalıyız. */