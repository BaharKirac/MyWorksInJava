package aarraysOppgaver;

/* Oppgave 2
Bruk arrayet i oppgave 1. Summer alle tallene med en for-løkke.
Finn så gjennomsnittet av alle tallene.
Summer så alle tallene som er større enn 5..
Finn så gjennomsnittet av disse.
Summer så tallene med en forenklet for-løkke. */
public class Oppgaver_2 {
    public static void main(String[] args) {
        int [] liste = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int i = 0; i< liste.length; i++){
            sum += liste[i];
        }
        System.out.println("Summen av listene er "+sum);

        double gjennomsnit = (double) sum / liste.length;
        System.out.println("Gjennomsnittet av de samme tallene er "+ gjennomsnit);

        sum = 0;
        int teller = 0;
        for (int i : liste){
            if (i >5){
                sum += i;
                teller++;
            }
        }
        System.out.println("Summen av listen er "+sum);
        gjennomsnit = (double) sum / teller;
        System.out.println("Gjennomsnittet av de samme tallene er "+ gjennomsnit);
    }
}
