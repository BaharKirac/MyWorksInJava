package klasserObjekter;

class Bags{
   public String merke;
   public String stoff;
   public  String farge;
   public int pris;

    public Bags(String merke, String stoff, String farge, int pris) {
        this.merke = merke;
        this.stoff = stoff;
        this.farge = farge;
        this.pris = pris;
    }

    public void skrivut(){
       System.out.println(merke+"\t"+ stoff+"\t"+ farge+"\t"+pris);
   }

}
public class KonstEksmpl {
    public static void main(String[] args) {
        Bags ryggsekk = new Bags("adidas","denim","svart",150);
        Bags handvesker = new Bags("david jones","lær","brunn",500);
        Bags skuldervesker = new Bags("gucci","ilær","red",900);

        ryggsekk.skrivut();
        handvesker.skrivut();
        skuldervesker.skrivut();

    }
}
