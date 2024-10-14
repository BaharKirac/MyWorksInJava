package løkker;

public class EksmpWhle {
    public static void main(String[] args) {
        //0 dan 20 ye kadar olan cift sayilari toplayan prog. while ile kodla.
        /*int i = 0;
        int sum = 0;
        while (i<=20){
            sum = sum+i;
            i = i+2;
        }
        System.out.println("toplam :"+sum);*/

        // ic ice donguler
        //icteki dongu tamamen bitmeden distaki donguye gecilmemelidir. saniye,dakika,saat ornegi
        //carpim tablosu olusturma
        for (int i = 1; i<=10; i++){
            for (int j = 1; j<=10; j++){
                System.out.printf("%d*%d=%d\t", j, i, i * j);
            }
            System.out.println();
        }

    }
}
