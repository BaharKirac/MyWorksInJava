package løkker;

/* tekrarlama islemininn kac kez yapilacaginin bastan belli oldugu
dongulerdir, ki tekrar sayisi bastan belli olan donguler olarak da adlandirilir.
ornek: 1 den 10 a kadar olan sayilari toplayan bir programda 9 kez tekrarlama yaptiriyorsaniz
bu tekrarlama sayisinin baslangicta belli oldugu anlamina gelir.*/


/* syntax:
for(dongu degiskeni=baslangic degeri;<kosul>; artim yada azalim miktari)
{ tekrarlanacak islem 1;
 tekrarlanacak islem 2 ;}

 for(d=b; kosul; b++ veya b--){}
 d : dongu degiskeni
 b : baslangic degeri
 kosul :  donguyu sonlandiracak kosul
 b++, b-- : artim yada azalim miktarini gosterir.
 * donguden cikisi gerceklestirecek yani kosulu saglayacak bir ifade dongu icerisinde olmalidir.
 aksi takdirde program cikisi vermez ve sonsuz donguye girer.
 */
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