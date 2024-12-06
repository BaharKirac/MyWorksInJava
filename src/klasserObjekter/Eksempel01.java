package klasserObjekter;

class Animals{
    private String tur;
    private String renk;

    public void ses (String tur, String renk) {
        this.tur = tur;
        this.renk = renk;
    }

    public void skriv() {
        System.out.println("Bir hayvan olan "+tur+ "rengi "+renk );
    }
}
public class Eksempel01 {
    public static void main(String[] args) {
        Animals kedi = new Animals();
        Animals kopek = new Animals();

        kedi.ses("kedi","beyaz");
        kopek.ses("Kopek","kahverengi");

        kedi.skriv();
        kopek.skriv();
    }
}
