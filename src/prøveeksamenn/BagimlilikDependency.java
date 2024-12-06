package prøveeksamenn;

/* 2. Bağımlılık (Dependency)
Bir sınıf, başka bir sınıfın metodunu çağırır, ancak onu üye değişken olarak tutmaz.

Bu, "bir şey kullanan" ilişkisidir.
Örnek: Bir Banka sınıfı, bir Müşteri sınıfının metodunu kullanır. */

class Musteri{
    private String  isim;

    public Musteri(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }
}

class Banka{
    public void krediVer(Musteri musteri){
        System.out.println("Kredi verilen musteri : "+musteri.getIsim());
    }
}
public class BagimlilikDependency {
    public static void main(String[] args) {

        Musteri musteri = new Musteri("Ayse");
        Banka banka = new Banka();

        //banka.krediVer();

    }
}
