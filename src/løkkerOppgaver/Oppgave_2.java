package løkkerOppgaver;
/* Lag en forløkke som summerer alle tallene fra 0 til 10
og viser summen (0 til og med 9) */
public class Oppgave_2 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i<=10; i++){
            sum += i;
        }
        System.out.println("Summen av tallene mellom 0 og 9 er :"+sum);
    }
}
