package klasserObjekter;

class Person001{
    public String navn;
    public int fødselsÅr;

    //KONSTRUKTØR
    public Person001(String navn, int fødselsÅr){
        this.navn = navn;
        this.fødselsÅr = fødselsÅr;
    }
}
public class Konstruktør {
    public static void main (String[]args){
        Person001 person11 = new Person001("Line Jensen",1999);
        //person11.navn = "Line jensen";
        //person11.fødselsÅr = 1999;
        System.out.println(person11.navn+" er født i "+person11.fødselsÅr);
    }
}

/* Konstruktør attributleri ayarlayan bir metoddur. Siniftan bir nesne
olusturuldugunda calisir.
 Det er vanlig å skrive denne som første metode i klassen (etter attributtene).
konstruktør sinifla ayni adi tasir, bu yuzden adi BUYUK HARFLE baslar.
siniftaki tum attributler yapiciya parametre olarak gecirilir.

This anahtar kelimesi ile sinifin adi esitlenir. this.navn=navn.
konstruktørler programciyi nesne olusturuldugunda parametreleri girmeye zorlar.
sinif icerisinden erisilecek uyeler icin kullanilir.
eksempel :
Person001 person11 = new Person001("Line Jensen",1999);

nesneleri başlatmamıza ve gerekli değerlerin yaratım sırasında ayarlanmasını sağlamamıza olanak tanır.
Nesnelerin oluşturulmasını basitleştirebilirler. Bir sınıf için birden fazla olabilir.
 */