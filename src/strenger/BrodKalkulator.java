package strenger;

public class BrodKalkulator {
    public static void main(String[] args) {

        //du trenger
        double melDl = 2;
        double vannDl = 3;

        //bland mel og vann

        double deigDl = melDl + vannDl; // Toplam hamur miktarı = 5 dl

        //hvert brød trenger 2.5dl deig

        double dlDeigPrBrod = 2.5;  // 1 ekmek için gerekli hamur

        //del deigen opp i brødporsjoner

        double antallBrød = deigDl / dlDeigPrBrod; // Kaç ekmek yapılabilir?

        System.out.println("Du kan lage " + antallBrød + " brød!");
    }
}
