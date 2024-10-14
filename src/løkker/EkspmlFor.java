package løkker;

public class EkspmlFor {
    public static void main(String[] args) {
        //1 den 23 e kadar olan tek sayilari ekranda gosteren prog. for dongusu ile kodla:
        for (int s=1; s<=23; s=s+2){
            System.out.print(s);
        }

        //0 dan 24 e kadar olan cift sayilari ekranda gosteren prog. for dongusu ile kodla:
        for (int i = 0; i<=24; i+=2){
            System.out.print(i+" ");
        }
        //1 tl 4.58 dolar, buna gore TL/DOLAR donusumu yapacak prog. kodla:
        int TL;
        double Dolar;
        System.out.println("TL"+"\t"+"DOLAR");
        for (TL=1; TL<11; TL++){
            Dolar=TL*4.58;
            System.out.println(TL+"\t"+Dolar);
        }
    }
}
