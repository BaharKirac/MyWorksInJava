package klasserObjekter2;

class Bil{
    public String type;
    public static final int ANTALL_HJUL = 4;
}
public class StatiskeVariabler {
    public static void main(String[] args) {
        Bil enBil = new Bil();
        enBil.type = "Vovlo";
        //Bil.antallHjul = 4;

        System.out.println(enBil.type+" har antall hjul:"+Bil.ANTALL_HJUL);

        Bil enAnnenBil = new Bil();
        enAnnenBil.type = "Audi";

        //Bil.antallHjul = 3;

        System.out.println(enBil.type+" har antall hjul:"+Bil.ANTALL_HJUL);
    }
}
