package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MoviePoster m1 = new MoviePoster("Poster1" , "Matrix Poster", 1999, 500, "ny", "The Matrix");
        SkateBoard s1 = new SkateBoard( "Board1", "Cool skateboard", 2015, 1200, "Brukt", "Tony Hawk", "Tre" );
        SportsEquipment sp1 = new SportsEquipment( "Ball", "Football", 2010, 300, "Ny", "Fotball", "Ball" );

        ArrayList<Collection> collections = new ArrayList<>();
        // Objeleri listeye ekliyoruz
        collections.add(m1);
        collections.add(s1);
        collections.add(sp1);

        double totalPrice = 0;

        Collection mostExpensive = collections.get(0);

        for (Collection c : collections){
            System.out.println(c);

            totalPrice += c.getPrice();

            if (c.getPrice() > mostExpensive.getPrice()){
                mostExpensive = c;
            }
        }

        System.out.println("Total price : " + totalPrice);

        System.out.println("Most expencive : " + mostExpensive);

    }
}

/* 13 Oppgave 12 - CollectiblesArchive del 1

Collecta Berg samler på ulike samlerobjekter. Du skal nå lage et lite program som gir en oversikt over samlingen.

Collecta samler på tre ulike typer samlerobjekter:

* Skateboard
* Sportsartikler
* Filmplakater

Alle objektene har noen felles egenskaper:

* navn (String) – kort navn på objektet
* beskrivelse (String) – en mer detaljert beskrivelse
* årstall (int) – året samlerobjektet ble laget
* pris (double) – prisen i kroner
* tilstand (String) – f.eks. "Ny", "Brukt", "Samlerkvalitet"

I tillegg har hver type noen særegne egenskaper:

Sportsartikler:

* sport (String, f.eks. "Fotball")
* type (String, f.eks. "Drakt" eller "Ball")

Skateboard:

* modell (String, f.eks. "Tony Hawk Pro")
* hovedMateriale (String, f.eks. "Tre")

Filmplakat:

* filmTittel (String, f.eks. "The Matrix")

I programmet ønsker vi å samle alle samlerobjekter i en felles datastruktur (som en ArrayList).

Underoppgaver del 1:

a) (5%)
Hvilke klasser kan det være hensiktsmessig å lage i programmet? (Hint: Arv).
Opprett klassene som trengs for samlerobjektene.

b) (5%)
For hver klasse legg til:

* attributter
* konstruktør
* getter-metoder
* en toString-metode
*/