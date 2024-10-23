package klasserObjekter2;

class Persn {
    public String navn;
        }
public class ObjekterReferanser {

    private static void  endreNavn(Persn personRef1, String navn){
        personRef1.navn=navn;
    }

    public static void main(String[] args) {
        Persn person1 = new Persn();
        person1.navn = "Heidi";

        System.out.println("Navnet til person1 er "+ person1.navn);
        endreNavn(person1,"Kari");
        System.out.println("Navnet til person1 ble nå : "+person1.navn);
    }
}
