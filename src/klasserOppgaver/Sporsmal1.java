package klasserOppgaver;
import static javax.swing.JOptionPane.*;
class Person0{
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnummer;

    public Person0 (String fornavn, String etternavn, String adresse,String telefonnummer){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
    }
    public String getFornavn(){
        return fornavn;
    }
    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }
    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }
    public String getAdresse(){
        return adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getTelefonnummer(){
        return telefonnummer;
    }
    public void setTelefonnummer(String telefonnummer){
        this.telefonnummer = telefonnummer;
    }
    public void skriveUt(){
        String ut = "Navn : "+fornavn+" "+etternavn+"\n"+
                "Adresse : "+adresse+"\n"+
                "Telefonnummer :"+telefonnummer;
        showMessageDialog(null,ut);
    }
}
public class Sporsmal1 {
    public static void main(String[]args){
        String fornavn = showInputDialog("Skriv inn fornavnet");
        String etternavn = showInputDialog("Skriv inn etternavnet");
        String adresse = showInputDialog("Skriv inn adressen");
        String telefonnummer = showInputDialog("Skriv inn telefonnummeret");

        Person0 enPerson = new Person0(fornavn,etternavn,adresse,telefonnummer);
        enPerson.skriveUt();
    }
}

/* Lag en klasse «Person» med følgende private attributter:
fornavn
etternavn
adresse
telefonnr
Lag en konstruktør som setter disse ved instansiering av klassen.
Lag så «get», «set» metoder for disse.
Lag så en metode som skriver ut dataene via
Swing sin ShowMessageDialog med linjeskift mellom de ulike feltene.
Skriv så kode i «main» for å lese inn dataene via Swing sin input,
opprette et objekt og kalle metoden over for å vise disse. */