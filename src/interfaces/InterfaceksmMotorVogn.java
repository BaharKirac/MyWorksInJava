package interfaces;

interface Kjoretoyy{
    public String toString();
}

class Dato{
    private int dag, måned, år;

    public Dato(int dag, int måned, int år) {
        this.dag = dag;
        this.måned = måned;
        this.år = år;
    }

    private static String månedsnavn(int mnd){
        String[] navn = {"januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember"};
        if (mnd>0 && mnd <13)
            return navn[mnd-1];
        else return "ukjent måned";
    }

    @Override
    public String toString() {
        return "Dato{" +
                "dag=" + dag +
                ", måned=" + måned +
                ", år=" + år +
                '}';
    }
}

class Motorsykkel implements Kjoretoyy{
    public String typeBetegnelse;
    public Dato førstegangsRegistert;
    public String kjennetegn;

    public Motorsykkel(String typeBetegnelse, Dato førstegangsRegistert, String kjennetegn) {
        this.typeBetegnelse = typeBetegnelse;
        this.førstegangsRegistert = førstegangsRegistert;
        this.kjennetegn = kjennetegn;
    }

    @Override
    public String toString() {
        return "Motorsykkel{" +
                "typeBetegnelse='" + typeBetegnelse + '\'' +
                ", førstegangsRegistert=" + førstegangsRegistert +
                ", kjennetegn='" + kjennetegn + '\'' +
                '}';
    }
}

class Bil implements Kjoretoyy{
    public String typeBetegnelse;
    public Dato førstegangsRegistert;
    public String kjennetegn;
    public int lastekapasitet;

    public Bil(String typeBetegnelse, Dato førstegangsRegistert, String kjennetegn, int lastekapasitet) {
        this.typeBetegnelse = typeBetegnelse;
        this.førstegangsRegistert = førstegangsRegistert;
        this.kjennetegn = kjennetegn;
        this.lastekapasitet = lastekapasitet;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "typeBetegnelse='" + typeBetegnelse + '\'' +
                ", førstegangsRegistert=" + førstegangsRegistert +
                ", kjennetegn='" + kjennetegn + '\'' +
                ", lastekapasitet=" + lastekapasitet +
                '}';
    }
}
public class InterfaceksmMotorVogn {
    public static void main(String[] args) {
        Kjoretoyy[] register = new Kjoretoyy[100];
        Dato dato1 = new Dato(1,3,2024);
        Bil volvo = new Bil("Volvo xc60",dato1,"TV84378",450);
        Dato dato2 = new Dato(4,10,2012);

        Motorsykkel ducati = new Motorsykkel("Ducati",dato2,"DR345");
        register[0]=volvo;
        register[1]=ducati;

        for (Kjoretoyy etkjoretoyy : register){
            if (etkjoretoyy !=null){
                System.out.println(etkjoretoyy);
                System.out.println("------");
            }
        }
    }
}
