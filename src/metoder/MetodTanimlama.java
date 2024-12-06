package metoder;
//? Statik metoder:  statik metodlari tanimlandigi sinifin yeni bir nesnesini olusturmadan
//? (new komutunu kullanmadan) dogrudan sinif adini referans gostererek cagirabiliriz

//* geriye deger dondurmeyen return yapmayan void tipli metod:

// class ProgramName { static void metodName() { yapilacaklar }}

class Hei{
    static void Hei(){
        System.out.print("Aziz ");
        System.out.print("Dostum!");

        Hei(); //Metod cagiriliyor
    }
}
public class MetodTanimlama {
    public static void main(String[] args) {}
}


//! static ifadesi secimliktir, yazilmaz ise, once siniftan bir nesne olusturulur ve metod m.Hei(); seklinde cagirilir.

/*
? geriye deger donduren metod: metod degeri return ile dondurulur.
! syntax: class ProgramName{ static donus tipi metod adi() { yapilacaklar return donus degeri; }}
 static int Toplam(x,y){
top = x + y;
return top;}
//metod cagiriliyor
Toplam(3,6);

*/