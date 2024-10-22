package aarrays2_Collections_Oppgaver;

import java.util.ArrayList;

/* Oppgave 1
Definer følgende helttalls-ArrayList: 1,2,3,4,5,6,7,8,9.
Skriv ut element nummer 3 og 6 med System.out */
public class Opgave1 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
       for (int i = 1; i<10; i++){
           liste.add(i);
       }
        System.out.println("Elementet nummer 3: "+liste.get(3));
        System.out.println("Elementet nummer 6: "+liste.get(6));
    }
}
