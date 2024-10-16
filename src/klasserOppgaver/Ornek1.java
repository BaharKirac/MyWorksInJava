package klasserOppgaver;

class bil{
    //class variabler
    private String merke;
    private String farge;
    private int motor;
    private int kapasite;

    //uye fonksiyonlar
    public void starter(String me, String fa, int mo, int ka){
        merke=me;
        farge=fa;
        motor=mo;
        kapasite=ka;
    }
    public void skrivUt(){
        System.out.println(merke+"\t"+ farge+"\t"+ motor+"\t"+kapasite);
    }
}
public class Ornek1 {
    public static void main(String[] args) {

        //bil classindan object turet
        bil lastebil = new bil();
        bil drosje = new bil();
        //bilgi gir
        lastebil.starter("Mercedes","Svart",3000, 9000);
        drosje.starter("Volvo", "Gronn", 1600, 3000);
        //ekrana yaz
        lastebil.skrivUt();
        drosje.skrivUt();
    }//main sonu
} //class sonu
