package løkkerOppgaver;

/* Oppgave 8
Lag en while-løkke som summerer
alle partallene fra 0 til 100 og
viser gjennomsnittet (0 til og med 98).

Finn også gjennomsnittet. */
public class Oppgave_8 {
    public static void main(String[] args) {
        int teller = 0;
        int sum =0;
        int i = 0;
        while (i < 100){
            sum += i;
            i+=2;
            teller ++;

        }
        System.out.print("Summen er "+sum+"\n");
        double gjennomsnitt = (double) sum/(double) teller;
        System.out.println("Gjennomsnitt er "+gjennomsnitt);
    }
}
