package arver;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.ref.PhantomReference;

class Ansatt {
    //ATTRIBUTTER
    private String navn ;
    protected double lønn;
//kONSTRUCTOR
    public Ansatt(String navn, double lønn) {
        this.navn = navn;
        this.lønn = lønn;
    }
//GET METODE
    public String getNavn() {
        return this.navn;
    }

    public double getLønn() {
        return this.lønn;
    }
}

class Selger extends Ansatt{
    private double bonus;

    public Selger(String navn, double lønn, double bonus) {
        super(navn, lønn);
        this.bonus = bonus;
    }

    public double getLønn() {
        return this.lønn+this.bonus;
    }
}
class  Montør extends Ansatt{
    private String bil;

    public Montør(String navn, double lønn, String bil) {
        super(navn, lønn);
        this.bil = bil;
    }
}
public class Arver {
    //MAIN METODE
    public static void main(String[] args) {
        //OBJEKTER

        Selger Per = new Selger("Per Hansen",650_000,10_000);
        Montør Ole = new Montør("Ole Hansen",450_000,"Volvo");
        System.out.println(Per.getNavn()+" har i lønn "+Per.getLønn());
        System.out.println(Ole.getNavn()+" har i lønn "+Ole.getLønn());
    }
}
/* composition-arv
Eğer sınıflar arasında bir "is-a" ilişkisi varsa
(örneğin, bir öğrenci bir kişidir),
miras tercih edilebilir.
Eğer sınıflar arasında bir "has-a" ilişkisi varsa
(örneğin, bir öğrenci bir kişiye sahiptir),
bileşim kullanılabilir.
*/