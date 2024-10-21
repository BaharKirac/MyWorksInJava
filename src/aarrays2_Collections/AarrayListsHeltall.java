package aarrays2_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class AarrayListsHeltall {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(23);
        liste.add(22);
        liste.add(-2);
        liste.add(-5);
//liste.remove(22); bu sekilde yapamayiz, bir ogeyi silmek icin once indexi bulunmali sonra remove edilmeli
        int indeks = liste.indexOf(22);
        liste.remove(indeks);

        Collections.sort(liste); //listeyi siralamak icin
        for (int tall : liste){
            System.out.print(tall+" ");
        }
    }
}
