package aarrays2_Collections;

import java.util.ArrayList;

class  Bil{
    public String farge;
    public int [] verdier = new int[5];
}
public class AarrayListsEksmpl {
    public static void main(String[] args) {
        ArrayList<Bil> biler = new ArrayList<Bil>();

        Bil enVolvo = new Bil();
        enVolvo.farge = "Rød";
        enVolvo.verdier[0] = 4; //antall dører
        enVolvo.verdier[1] = 250; //antall HK

        Bil enAudi = new Bil();
        enAudi.farge = "Svart";
        enAudi.verdier[0] = 5 ;
        enAudi.verdier[1] = 345;

        biler.add(enAudi);
        biler.add(enVolvo);

        for (Bil enBil :  biler){
            System.out.println("Fargen er: "+enBil.farge);
            System.out.println("Antall dører er: "+enBil.verdier[0]);
            System.out.println("Antall HK er: "+enBil.verdier[1]);
            System.out.println("***********");
        }
        biler.remove(enVolvo);
        biler.remove(enVolvo);

        for (Bil enBil : biler){
            System.out.println("Fargen er: "+enBil.farge);
            System.out.println("Antall dører er: "+enBil.verdier[0]);
            System.out.println("Antall HK er: "+enBil.verdier[1]);
            System.out.println("***********");
        }
        System.out.println("Lengden på arrayet er nå: "+biler.size());
        biler.clear();
        System.out.println("Lengden på arrayet er nå: "+biler.size());
    }
}
