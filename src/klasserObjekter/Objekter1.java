package klasserObjekter;

class Bil {
    public String farge;
    public void visFarge(){
        System.out.println("Fargen til bilen er "+farge);
    }
}
public class Objekter1 {
    public static void main(String[]args) {
        Bil nyBil = new Bil();
        nyBil.farge = "Blå";

        nyBil.visFarge();
    }
}

/*
1. Java'da bir sınıf oluşturmak için class anahtar kelimesi kullanılır.
Sınıf adı, sınıfı temsil eden ismi belirtir.
Sınıf adı genellikle büyük harfle başlar ve CamelCase tarzında yazılır.
 eksempel:
 class ClassName {
    // Sınıfın özellikleri (değişkenler)
    // Sınıfın davranışları (metotlar)
}
2. degisken tanimlama
Bir sınıf, nesnelerin sahip olabileceği özellikleri temsil eden değişkenler (variable) içerir.
Bu özellikler, sınıfın içinde tanımlanır ve genellikle sınıfın üyeleri (attributter) olarak adlandırılır.
class Car {
    String color;   // Arabanın rengi
    String model;   // Arabanın modeli
    int year;       // Arabanın üretim yılı
}
3.Sınıfın Davranışları (Methods) method tanimlama
Sınıfın davranışları, sınıfın içinde tanımlanan metotlar (functions) ile belirlenir.
Bu metotlar, sınıfın özelliklerini işlemek veya belirli işlemleri gerçekleştirmek için kullanılır.
class Car {
    String color;
    String model;
    int year;

    void startEngine() {
        System.out.println("Engine started.");
    }

    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}
4.Nesne Oluşturma (Instantiating)
Oluşturduğunuz sınıftan bir nesne oluşturmak için new anahtar kelimesi kullanılır.
Oluşturulan nesne, sınıfın bir örneği (instance) olarak adlandırılır ve
sınıfın tüm özelliklerini ve metotlarını kullanabilir.
eksempel:
public class Main {
    public static void main(String[] args) {
        // Car sınıfından bir nesne oluşturma
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Tesla Model S";
        myCar.year = 2022;

        // Nesneye ait metotları kullanma
        myCar.startEngine();
        myCar.stopEngine();
    }
}
Özet
Java'da bir sınıf oluşturmak için:

1.class anahtar kelimesi ile sınıf tanımlanır.
2.Sınıf içinde değişkenler (fields) tanımlanır.
3.Sınıfın davranışları (methods) tanımlanır.
4.Sınıftan bir nesne oluşturmak için new anahtar kelimesi kullanılır.
5.Constructor ile nesnelerin özellikleri başlangıç değerlerine atanabilir.

*/
