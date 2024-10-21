package aarrays2_Collections;

import java.util.ArrayList;

/* Collections nesnelerin yapisal bir sekilde depolandigi bir yapidir
bu bir liste, tablos vb. olabilir.Java da bellekte verileri saklamanin
 en yaygin yolu dizilerdir.
 ArrayList de bir tur koleksiyondur. Bu arrayList olusturdugumuzda aslinda
 bir nesne objekt olusturmus oluruz. Bu nesne de bir dizi icerir.
 ancak ayni zamanda bu dizi uzerinde manipulasyon yapmamimizi saglayan
 bir cok metot sunar. Ornegin;
  Manipulerer ArrayListen med metoder
• add - legger et objekt inn i listen - listeye bir nesne ekler
• clear - fjerner alle objektene i listen- listedeki tum nesneleri siler, liste bos hale gelir
• contains - sjekker om et objekt er finnes i listen (true / false)- bir nesnenin dizi de olup olmadigini kontrol eder.
• get - returnerer et element med en spesifik index- belirli bir indexde bir ogeyi dondurur
• indexOf - returnerer indeksen til det første oppgitte objektet- bir nesnenin dizideki indexini dondurur
• remove - sletter et objekt- listedeki bir nesneyi siler
• size - finner lengden på listen- dizinin uzunlugunu bulur- length metod degil sabit bir degerdir
• trimToSize - optimaliserer minnet etter sletting (forandrer ingenting)- bellek optimizasyonu icin kullanilir
Ligger i pakken java.util.ArrayList;
• ArrayList<String> liste = new ArrayList<>();  - syntax bu
<> bu parantez de hangi sinif yada tur oldugu yazilir
bu listede saklanan bir nesneler toplulugunu ifade eder.
liste adi verilen bir nesne listesi olur
Primitive datatyper kan listen ikke inneholde.
 */


//String arrayList icin ornek
class PersonList{
    public String navn;
    public int alder;
}
public class AarrayLists {
    public static void main(String[] args) {
        ArrayList<PersonList> personer = new ArrayList<>();
        PersonList ole = new PersonList();
        ole.navn = "Ole";
        ole.alder = 23;
        personer.add(ole); //Ole nesnesi personer listesine ekleniyor. Nullte posisjonda olur listede
        //personer.remove(ole); //Ole nesnesi listeden siliniyor

        PersonList line = new PersonList();
        line.navn = "Line";
        line.alder = 32;
        personer.add(line); //Line nesnesi personer listesine ekleniyor
        //personer.remove(1); //1. indexteki nesne siliniyor index yontemi ile, yani Line
        //personer.clear(); tum personlar listeden siliniyor
        int indeks = personer.indexOf(ole); //ole nin kacinci indexte oldugunu gosterir
        System.out.println("Indeksen til objekt ole : "+indeks);

        /*if (personer.contains(ole)){ //ole nin listede olup olmadigi kontrol ediliyor
            System.out.println("Ole er i lista!");
        }
        else{
            System.out.println("Ole er ikke i lista!");
        }*/

        for (PersonList enPerson : personer){
            System.out.println(enPerson.navn+" "+ enPerson.alder);
        }
    }
}

/* for løkke ile erisim
listeyi bir dongu ile gezebiliriz
for (int i = 0; i < personer.size(); i++){ //size yontemi listenin uzunlugunu verir
        System.out.println(personer.get(i).navn+" "+personer.get(i).alder);
        }
Ole 23
Line 21*/
