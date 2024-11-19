package interfaces;

/* Bir interface objekt yada classlar icin bir kontraktir(sozlesmedir).
bu kontrakt hangi metodlarin ve bu metodlarin hangi signaturlere sahip olmasi
gerektigini belirtir. Boylece nesneler bu metodlari uygulamak zorunda kalir.
Bir interface, içinde yalnızca imzaları belirtilen metotlar
(method signatures) ve sabitler (constants) barındırır.
*Birden fazla sınıfın aynı davranışları (metotları)
sergilemesi gerekiyorsa, bir interface kullanmalısınız.
*/
interface Ansatt{
    //iki metod bulunuyor bu interface de

    /* Ansatt bir arayüz olarak,
    "herhangi bir çalışan sınıfı bu metodları içermek zorunda"
    diyen bir sözleşme sunar. */

    public double lønn();
    public String getNavn();

}
class Selger implements Ansatt{
    //selger sinifi bu ansatt arayuzunu uyguluyor.
    //selger sinifi bu interface de listelenen iki metodu uygulamak zorundadir.yani tanimlamali
    private String navn; //attributtler ozellikler
    private double lønn;
//bu attributleri baslatmak icin bir konstruktor tanimlaniyor
    public Selger(String navn, double lønn) {
        this.navn = navn;
        this.lønn = lønn;
    }
//iki metod tanimlaniyor
    @Override
    public String getNavn() {
        return this.navn;
    }

    public double lønn() {
        return lønn+30_000;
    }
}
class Montor implements Ansatt{
    private String navn;
    private double lønn;

    public Montor(String navn, double lønn) {
        this.navn = navn;
        this.lønn = lønn;
    }

    @Override
    public String getNavn() {
        return this.navn;
    }

    public double lønn() {
        return lønn;
    }
}
//Yeni bir çalışan türü eklemek kolaydır
class Sjafor implements Ansatt{
    public Sjafor() {
    }

    @Override
    public double lønn() {
        return 0;
    }

    @Override
    public String getNavn() {
        return null;
    }
}
public class Interfaces {
    public static void main(String[] args) {
        //objeler olusturuluyor, selger ve montor icin
        /* Polimorfizm Kullanımı:
        Polimorfizm ile aynı türde (Ansatt)
        bir diziye farklı türde (Selger ve Montør) nesneler eklenebilir.
        Her iki nesne de Ansatt türünde saklanıyor.
        Bu, Java'nın polimorfizm özelliğini kullanır ve
        arayüz türünde bir referansın,
        bu arayüzü uygulayan herhangi bir nesneyi tutmasını sağlar.
        */
        Ansatt enSelger = new Selger("Per Hansen",450_000);
        Ansatt enMontor = new Montor("Ole Pedersen",300_000);

        /*
  Ansatt türünde bir dizi (array) oluşturulur.
enSelger ve enMontor dizinin ilk iki indeksine eklenir.
Geri kalan indeksler null olarak kalır.*/
        Ansatt[] liste = new Ansatt[10];
        liste[0] = enSelger;
        liste[1] = enMontor;
/* Döngü dizideki her elemana gider.
Eğer eleman null değilse,
çalışanın adı (getNavn()) ve maaşı (lønn()) ekrana yazdırılır.*/
        for (int i =0; i< liste.length && liste[i]!=null;i++){
            System.out.println(liste[i].getNavn()+" tjener "+liste[i].lønn());
        }

        // alternativt
        /*for (Ansatt enAnsatt : liste){
            if(enAnsatt!=null){
                System.out.println(enAnsatt.getNavn()+" tjener "+enAnsatt.lønn());
            }}*/
    }
}
