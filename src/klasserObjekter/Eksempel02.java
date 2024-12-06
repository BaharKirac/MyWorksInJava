package klasserObjekter;

class constrFonk{
    double PI, r;

    public constrFonk(){ // parametresiz constructor tanimi
        PI = 3.14;
        r=5;
    }

    public constrFonk(double x, double y){ //parametreli constructor tanimlama
        PI=x;
        r=y;
    }

    double alan(){
        return PI*r*r;
    }

}
public class Eksempel02 {
    public static void main(String[] args) {
        System.out.println("** test islemi **");
        constrFonk fd = new constrFonk();
        constrFonk fd2 = new constrFonk(3.14, 6);
        System.out.println("Yaricapi 5 olan dairenin alani: "+fd.alan());
        System.out.println("Yaricapi 6 cm olan dairenin alani: "+fd2.alan());
    }
}
