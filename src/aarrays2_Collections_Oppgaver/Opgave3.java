package aarrays2_Collections_Oppgaver;

import java.util.ArrayList;

/* Oppgave 3
Definer et heltalls-arrayet  :
1,2,3,4,5,6,7,8,9. Skriv kode for å konvertere
dette til et ArrayList.
Skriv så ut denne ArrayListen. */
public class Opgave3 {
    public static void main(String[] args) {
        int [] list1 = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> liste2 =  new ArrayList<>();

        for (int i : list1){
            liste2.add(i);
        }

        for (int i = 0; i< liste2.size(); i++){
            System.out.print(liste2.get(i)+" ");
        }
    }
}
