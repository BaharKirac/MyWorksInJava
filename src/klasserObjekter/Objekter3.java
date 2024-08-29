package klasserObjekter;

//Metoder, inn og utdata
class Bil1{
    private String farge;

    public void settFarge(String fargen){
        farge = fargen;
    }

    public String hentFarge(){
        return farge;
    }
}
public class Objekter3 {

    public static void main(String []args){
        Bil1 nyBil = new Bil1();
        nyBil.settFarge("Blå");
        String bilFargen = nyBil.hentFarge();
        System.out.println("Fargen til bilen er "+bilFargen);
    }

}
