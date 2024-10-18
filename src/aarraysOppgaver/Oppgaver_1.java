package aarraysOppgaver;

/* Oppgave 1
Definer følgende helttalls-array: 1,2,3,4,5,6,7,8,9.
Skriv ut element nummer 3 og 6 med System.out */
public class Oppgaver_1 {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6,7,8,9};//definere direkte

        int [] liste1 = new int[9];
        liste1[0]=1;
        liste1[1]=2;
        liste1[2]=3;
        liste1[3]=4;
        liste1[4]=5;
        liste1[5]=6;
        liste1[6]=7;
        liste1[7]=8;
        liste1[8]=9;

        System.out.println("Posisjonen 3 og 6 er "+liste1[3]+ " og "+liste1[6]);
    }
}
