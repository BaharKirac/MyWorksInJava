package aarrays2_Collections_Oppgaver;

/* Oppgave 4
Definer et ArrayList attay : 1,2,3,4,5,6,7,8,9.
Skriv kode for å konvertere dette til et vanlig heltalls-array.
Skriv så kode for å skrive ut det nye heltalls-arrayet */

import java.util.ArrayList;

public class Opgave4 {
    public static void main(String[] args) {
        ArrayList<Integer> list2= new ArrayList<>();
        for (int i = 0; i<10; i++){
            list2.add(i);
        }
        int [] liste3 = new int[list2.size()];
        for (int i = 0; i< list2.size();i++){
            liste3[i]= list2.get(i);
        }
        for (int i : list2){
            System.out.print(i+ " ");
        }
    }
}
