package arver;

class Ansatt1 {
    private String navn;
    private double lonn;

    public Ansatt1(String navn, double lonn) {
        this.navn = navn;
        this.lonn = lonn;
    }

    public String getNavn() {
        return this.navn;
    }

    public double getLonn() {
        return this.lonn;
    }
}

class Selger1 extends Ansatt1{
    private static final double bonus = 30_000;

    public Selger1(String navn, double lonn) {
        super(navn, lonn);
    }
    public double getLonn() {
        return super.getLonn()+bonus;
    }
}

class Montor extends Ansatt1{
    public Montor(String navn, double lonn) {
        super(navn, lonn);
    }
}
public class ArvPoly {
    public static void main(String[] args) {
        Ansatt1 Selger2 = new Selger1("Per Hansen",425_000);
        Ansatt1 Montor2 = new Montor("Ole Hansen",350_000);

        Ansatt1[] liste = new Ansatt1[10];
        liste[0]= Selger2;
        liste[1] = Montor2;

        for (int i =0; i< liste.length && liste[i]!=null; i++){
            System.out.println(liste[i].getNavn()+ " tjener "+liste[i].getLonn());
        }
    }
}
