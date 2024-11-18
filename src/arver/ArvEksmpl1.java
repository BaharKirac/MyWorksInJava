package arver;
//superclass
class Båt{
    public double lengde;
//konstruktor
    public Båt(double lengde) {
        this.lengde = lengde;
    }

    public double getLengde() {
        return this.lengde;
    }
}

//subclass
class Seilbåt extends Båt{
    public double seilareal;

    public Seilbåt(double lengde, double seilareal) {
        super(lengde); //Bir alt sınıf, üst sınıfın yapıcısını çağırmak için super anahtar kelimesini kullanır. konstruktor de ilk sirada yer alir super.
        this.seilareal = seilareal;
    }

    public double getSeilareal() {
        return this.seilareal;
    }
}
public class ArvEksmpl1 {
    public static void main(String[] args) {
        Seilbåt enBåt = new Seilbåt(33,100);
        System.out.println(enBåt.getSeilareal());
    }
}
