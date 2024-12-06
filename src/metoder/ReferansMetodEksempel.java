package metoder;

import java.util.ArrayList;

class ReferanceEksempel{
    public static void ekle (ArrayList<String> liste){
        liste.add("Yeni eleman"); //orijinal listeye eleman ekleniyor
    }
}
public class ReferansMetodEksempel {
    public static void main(String[] args) {
ArrayList<String> myList = new ArrayList<>();
myList.add("Eski eleman");
 ReferanceEksempel.ekle(myList); //metod listeye eleman ekler
        System.out.println(myList);
    }
}
