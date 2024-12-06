package prøveeksamenn;

/* Sınıflar Arası İlişki Türleri
1. Kompozisyon (Composition)
Bir sınıf, başka bir sınıfın nesnesini bir üye değişken (field) olarak kullanır.

Bu, "bir şeyin parçası" ilişkisidir.
Örnek: Bir Araba sınıfı, bir Motor nesnesine sahiptir. */
class Motor{
    private String motortype;

    public Motor(String motortype) {
        this.motortype = motortype;
    }

    public String getMotortype() {
        return motortype;
    }
}

class Araba {
    private String marka;
    private Motor motor; //! Kompozisyon: Araba bir Motor içerir

    public Araba(String marka, Motor motor) {
        this.marka = marka;
        this.motor = motor;
    }

    public void arabaBilgisi(){
        System.out.println("Arabanin markasi "+marka+ ", motor tipi "+motor.getMotortype());

    }
}
public class Oppgave_04 {
    public static void main(String[] args) {
        Motor motor = new Motor("V8.");
        Araba araba = new Araba("BMV", motor);

        araba.arabaBilgisi();
    }
}
