package klasserObjekter;

class Bøker {  //klasse navn lag en klasse
    String tittel;  //inneholder følgende attributter i denne klasse
    double pris;
    String forfatter;
    String isbnNummer;

    //klassen har metod som skriver ut attributtene via sout.
    //void cunku returnerer ikke noe, bare skriver ut
    public void lesBok () {

        System.out.println("Tittelen til boka er "+tittel+", pris er "+pris+", forfatteren er "+forfatter+", Isbn Nummer er "+isbnNummer);
    }
}
public class Oppgave01 {
    // main de bu sinif icin bir objekt olusturma new ismi ile
    // ve attributleri yerlestirip bunlara verdi atama
    public static void main(String[]args){
        Bøker minBok = new Bøker();
        minBok.tittel = "Nutuk";
        minBok.pris = 75.99;
        minBok.forfatter = "Ataturk";
        minBok.isbnNummer = "12345678909";

        minBok.lesBok(); //bu attributlari ustteki sablon olan klassdan alip
                        // yeni haliyle Sys.out ile yazdirma

    }
}

/* Lag en klasse kalt Bøker.
Denne klassen skal ha følgende attributter:

tittel
pris
forfatter
iSBN-nummer

Videre skal klassen ha en metode som skriver ut
de enkelte attributtene via System.out.

Skriv nødvendig kode i main for å opprette et objekt av
denne klassen og  sette attributtene til noen verdier.
Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.
 */