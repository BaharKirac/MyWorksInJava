package løkkerOppgaver;

/* Oppgave 4
Lag en forløkke som summerer alle partallene
fra 0 til 100 og
 viser gjennomsnittet (0 til og med 99) */
public class Oppgave_4 {
    public static void main(String[] args) {
        int teller = 0;
        int sum = 0;
        for (int i=0; i<=100; i+=2){
            sum += i;
            teller ++;
        }
        System.out.print("Summen av alle partallene fra 0 til 98 er "+ sum +"\n");
        double gjennomsnitt = (double) sum / (double) teller;
        System.out.println("Gjennomsnittet av alle partallene fra 0 til 98 er "+ gjennomsnitt);
    }
}
