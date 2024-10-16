package klasserObjekter;

class Kjoretoy{
    protected int aHiz=0;
    private String farge="gull";
    private boolean durum = false;

    public void start(int Hiz){
        durum=true;
        if (durum == true){
            aHiz=aHiz+Hiz;
        }
    }

    public void stopp (){
        if (durum==true){
            aHiz=0;
            durum=false;
        }
    }

    public void vis(){
        System.out.println("calisma: "+durum+" Hizi : "+aHiz);
        System.out.println("rengi : "+farge);
    }

    public class Taxi extends Kjoretoy{
        public void hizliGit(){
            aHiz=aHiz+50;
            System.out.println("Su anki hizi : "+aHiz);
        }
    }

    public class Lastebil extends Kjoretoy{}

}
public class Miras {
    public static void main(String[] args) {
        Kjoretoy.Taxi reno =new  Kjoretoy(). new Taxi();
        Kjoretoy.Lastebil bmc=new Kjoretoy().new Lastebil();

        reno.start(30);
        reno.vis();
        reno.hizliGit();

        bmc.start(10);
        bmc.vis();
        bmc.stopp();

    }
}
