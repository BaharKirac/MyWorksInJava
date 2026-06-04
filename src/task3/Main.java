package task3;

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            // Scanner oluşturuyoruz
            Scanner input = new Scanner(System.in);

            // AirQualitySystem objesi oluşturuyoruz
            AirQualitySystem system = new AirQualitySystem();

            try {

                // Kullanıcıdan ölçüm alıyoruz
                System.out.println("Skriv inn måling:");
                int measure = input.nextInt();

                // nextLine temizleme
                input.nextLine();

                // Kullanıcıdan ay ismi alıyoruz
                System.out.println("Skriv inn måned:");
                String month = input.nextLine();

                // Hava kalitesi hesaplanıyor
                String airQuality = system.airQualityStatus(measure);

                // Uyarı gerekli mi kontrol ediliyor
                boolean warning = system.warn(measure, month);

                // Eğer uyarı gerekiyorsa
                if (warning) {

                    // Uyarı mesajı alınıyor
                    String tiltak = system.getWarning(airQuality);

                    // Sonuç ekrana yazdırılıyor
                    System.out.println(
                            "Varsel: Luftkvaliteten er "
                                    + airQuality
                                    + ". Tiltak: "
                                    + tiltak
                    );
                }

                // Uyarı gerekmiyorsa
                else {
                    System.out.println(
                            "Varsel: Ikke nødvendig basert på måned og luftkvalitet."
                    );
                }

            }

            // Hatalı giriş kontrolü
            catch (Exception e) {
                System.out.println("Ugyldig input");
            }
        }
    }

    /*
    11 Oppgave 11 - AirQualitySystem

I Oslo er det tidvis dårlig luftkvalitet på grunn av forurensning fra trafikk. Det er satt opp flere målestasjoner i byen som måler luftkvaliteten slik at den lokale regjeringen kan komme med anbefalinger til befolkningen basert på helsefaren denne forurensningen skaper.

I denne oppgaven skal du lage et program som advarer befolkningen i Oslo om luftkvaliteten er for dårlig.

Underoppgaver del 1:

I del 1 av denne oppgaven skal du opprette en klasse ved navn AirQualitySystem som implementerer metodene gitt under.

a) (10%)
Lag en metode airQualityStatus.

Metoden skal:

* ha en parameter av type int med navn measure
* returnere en String som angir luftkvalitet basert på verdien til measure

Regler:

* 0–12 → "God"
* 13–35 → "Moderat"
* 36–55 → "Usunn"
* 56–150 → "Veldig usunn"
* Over 150 → "Farlig"

b) (10%)
Lag en metode med navn warn.

Metoden skal ha to parametre:

* int measure
* String month

Metoden skal returnere en boolean som angir om befolkningen må varsles eller ikke.

Regler:

* Vinter (desember–februar): varsle hvis measure > 30
* Sommer (juni–august): varsle hvis measure > 50
* Vår og høst (mars–mai og september–november): varsle hvis measure > 40

c) (10%)
Lag en metode med navn getWarning.

Metoden skal ha en parameter:

* String airQuality

Metoden skal returnere en tekst med tiltak basert på luftkvaliteten.

Regler:

* "Farlig" → "Stans all biltrafikk og informer befolkningen"
* "Veldig usunn" → "Begrens bilkjøring og vurder hjemmekontor"
* "Usunn" → "Informer befolkningen og anbefal redusert aktivitet ute"
* "Moderat" → "Informer befolkningen"
* "God" → "Ingen spesielle tiltak"

Underoppgaver del 2:

d) (10%)
Lag en Main-klasse med en main-metode.

Programmet skal:

* hente inn measure fra bruker
* hente inn month fra bruker
* finne luftkvalitet
* sjekke om varsling er nødvendig

Hvis varsling er nødvendig:
skriv ut:
"Varsel: Luftkvaliteten er <airQuality>. Tiltak: <tiltak>"

Hvis varsling ikke er nødvendig:
skriv ut:
"Varsel: Ikke nødvendig basert på måned og luftkvalitet."

e) (10%)
Sørg for å håndtere ugyldig input fra brukeren.
*/