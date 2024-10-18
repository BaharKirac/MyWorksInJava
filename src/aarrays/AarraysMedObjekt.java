package aarrays;

import static javax.swing.JOptionPane.*;
class film{
    private String tittel;
    private double pris;

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        if (pris > 0){
            this.pris = pris;
        }
    }

    public film(String tittel, double pris) {
        this.tittel = tittel;
        this.pris = pris;
    }
}
public class AarraysMedObjekt {
    public static void main(String[] args) {

        film[] filmer = new film[100]; // 100 film kapasiteli bir dizi oluşturuluyor
        int antall =0;  // Girilen film sayısını takip ediyor
        double innPris = Double.parseDouble(showInputDialog("Skriv inn prisen på filmen, avslutt med 0:"));
        String innTittel = showInputDialog("Skriv inn tittel : ");

        // Kullanıcıdan film bilgileri alınıyor ve diziye ekleniyor
        while (antall < filmer.length && innPris > 0 ){
            film enFilm = new film(innTittel, innPris); // Yeni film nesnesi oluşturuluyor
            filmer[antall] = enFilm; // Diziye ekleniyor
            antall++; // Film sayısı artırılıyor

            // Kullanıcıdan tekrar fiyat ve başlık alınıyor
            innPris = Double.parseDouble(showInputDialog("Skriv inn prisen på filmen, avslutt med 0 : "));
            innTittel = showInputDialog("Skriv inn tittel: ");

            // Filmleri ekrana yazdırma
            int i = 0;
            String ut = "Her er alle filmene : \n";
            while (filmer[i] !=null){ // Dizi boş bir elemana (null) ulaşana kadar döngü devam eder
                ut += "Tittel : "+ filmer[i].getTittel(); // Film başlığını ekler
                ut += " Pris : " + filmer[i].getPris()+ "\n"; // Film fiyatını ekler
                i++;
            }
            showMessageDialog(null, ut); // Sonuçları bir mesaj kutusunda gösterir
        }
    }
}

/* Program, her film için başlık (tittel) ve fiyat (pris) bilgilerini
saklayan bir film sınıfı oluşturur ve
bu sınıftan türetilen nesneleri bir array içine ekler.
Sonra bu dizi ekrana yazdırılır. */