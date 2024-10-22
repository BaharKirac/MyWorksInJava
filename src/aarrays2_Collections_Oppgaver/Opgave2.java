package aarrays2_Collections_Oppgaver;

import java.util.ArrayList;
import java.util.Collections;

/* Oppgave 2
Bruk samme array som i oppgave 1.
Legg til tallene 10 og 11 i arrayet.
Slett så elementene med tallene 2 og 3.
Skriv så ut hele arrayet med en for-løkke.
Bruk size() for å finne lengden i arrayet. */
public class Opgave2 {
    public static void main(String[] args) {
        ArrayList<Integer> liste1 = new ArrayList<>();
        for (int i= 1; i<10; i++){
            liste1.add(i);
        }
        liste1.add(10);
        liste1.add(11);
        liste1.remove(1);
        liste1.remove(1);

        for (int i = 0; i<liste1.size(); i++){
            System.out.print(liste1.get(i)+" ");
        }
    }
}
