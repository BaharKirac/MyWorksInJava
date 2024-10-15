package løkkerOppgaver;

/* Oppgave 6
Lag en while-løkke som summerer
 alle tallene fra 0 til 10 og viser summen
  (0 til og med 9) */
public class Oppgave_6 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i<10){
            sum += i;
            i++;
            System.out.println("summen er alle tallene fra 0 til 9"+ sum);
        }
    }
}
