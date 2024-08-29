package klasserObjekter;

import java.text.DecimalFormat;

public class StatiskeMet {
    private static double beregnAreal(double radius){
        double areal = Math.PI * Math.pow(radius, 2);
        return areal;
    }

    public static void main (String [] args){
        double radius = 23.23;
        double areal = beregnAreal(radius);
        DecimalFormat df2 = new DecimalFormat(".##");

        System.out.println("Arealet til en sirkel med radius "+radius+" er "+df2.format(areal));
    }
}


/*
* Statik bir metot, bir sınıfa ait olup,
* o sınıftan bir nesne (örneğin bir araba veya insan gibi) oluşturmadan
* kullanılabilen bir metottur. Normalde,
* bir sınıfta tanımlı olan metotları kullanmak için
* önce o sınıftan bir nesne oluşturmanız gerekir.
* Ancak statik metotlar, bu nesne oluşturma adımını atlar ve doğrudan kullanılabilir.
*Diyelim ki, bir "Matematik" sınıfımız var ve
* bu sınıfta bir sayıların karesini hesaplayan bir metot tanımladık.
* Eğer bu metot statik değilse,
* onu kullanmak için önce bir Matematik nesnesi oluşturmanız gerekir.
* ornek:
Matematik matematikNesnesi = new Matematik();
int sonuc = matematikNesnesi.kare(5);
* Eğer bu metot statik olsaydı, direkt sınıf ismiyle çağırabilirdik:
* yani; int sonuc = Matematik.kare(5);
* Bu çok daha basit ve kolaydır çünkü nesne oluşturmamıza gerek kalmaz.
*Diyelim ki, bir dairenin alanını hesaplayan bir statik metot yapmak istiyoruz.
* Bu metodu Daire sınıfında şöyle tanımlarız:
* class Daire {
    public static double alanHesapla(double yaricap) {
        return 3.14 * yaricap * yaricap;
    }
}
Bu metodu kullanmak için
* Daire sınıfından bir nesne oluşturmamıza gerek yok:
double alan = Daire.alanHesapla(5);*/