package swingInput;
 import static javax.swing.JOptionPane.*;
class Bok{
    public String tittel;
    public String forfatter;
    public double pris;

    public double regnUtRabatt(double prosent){
        double rabatt = pris*(prosent/100);
        return rabatt;
        // kan også sette rabatten direkte her uten å returnere den
        // altså oppdatere prisen direkte her med pris = pris-rabatt
    }

    public void  skrivUtBok(){
        String ut = "Her er bok informasjonen:\n";
        ut+= "Tittel : "+tittel+ "\n";
        ut+= "Forfatter : "+forfatter+"\n";
        ut+="Pris : "+pris+"\n";
        showMessageDialog(null, ut);

    }
}
public class Eksempel1 {
    public static void main(String[] args) {
        // les inn dataene
        String tittel = showInputDialog("Skriv inn bok tittel:");
        String forfatter = showInputDialog("Skriv inn forfatter:");
        double pris = Double.parseDouble(showInputDialog("og prisen"));
        // opprett boken
        Bok bok1 = new Bok();
        bok1.tittel=tittel;
        bok1.forfatter=forfatter;
        bok1.pris=pris;
        // sjekk om rabatt
        String person =  showInputDialog("Ansatt eller student?");
        if (person.equals("Ansatt")){
            double rabatt = bok1.regnUtRabatt(15);
            bok1.pris = bok1.pris-rabatt;
        }
        bok1.skrivUtBok();
    }

}
