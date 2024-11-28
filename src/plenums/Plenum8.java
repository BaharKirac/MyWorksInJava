package plenums;
import static javax.swing.JOptionPane.*;
class Book{
    public String tittel;
    public String forfatter;
    public double pris;

    public double RegnUtRabatt(double prosent){
        double rabatt = pris * (prosent/100);
        return rabatt;
        //* kan også sette rabatten direkte her uten å returnere den
        //* altså oppdatere prisen direkte her med pris = pris-rabatt
    }

    public void skrivUtBok(){
        String ut = "Her er bokinformasjon:\n";
        ut+="Tittel : "+ tittel+"\n";
        ut+= "Forfatter : "+ forfatter +"\n";
        ut+="Pris : "+pris+"\n";
        showMessageDialog(null,ut);
    }
}
public class Plenum8 {
    public static void main(String[] args) {
//* les inn dataene
        String tittel = showInputDialog("Skriv inn boktittel:");
        String forfatter = showInputDialog("Skriv inn forfatter:");
        double pris = Double.parseDouble(showInputDialog("og prisen"));
        //* opprett boken
        Book bok1 = new Book();
        bok1.tittel = tittel;
        bok1.forfatter= forfatter;
        bok1.pris=pris;
        //* sjekk om rabatt
        String person = showInputDialog("Ansatt eller student?");
        if (person.equals("Ansatt")){
            double rabatt = bok1.RegnUtRabatt(15);
            bok1.pris = bok1.pris-rabatt;
        }
        bok1.skrivUtBok();
    }
}
