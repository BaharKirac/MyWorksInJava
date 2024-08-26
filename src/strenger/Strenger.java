package strenger;

public class Strenger {
    public static void main(String [] args) {
        String navn  = "Bahar Kirac";
        String adresse = "Elgtråkket 11D";
        String ut = navn + " " + adresse;
        System.out.print(ut);
    }
}
//String Birleştirme (Concatenation):
//Java'da + operatörü, iki String'i birleştirmek için kullanılır.
//ut değişkenine atanan ifade şu şekildedir: ut = navn + " " + adresse;.
//Burada, " " (boşluk) bir String sabittir ve navn ile adresse değişkenleri arasına eklenir.
//Sonuç olarak, ut değişkeninin değeri, navn ve adresse değişkenlerinin birleştirilmesiyle oluşan "Per Hansen Askerveien 82" olur.
//Bu nedenle, ut değişkeninde tırnak işaretleri kullanılmamış;
// çünkü buradaki amaç, navn ve adresse değişkenlerinin gerçek değerlerini birleştirip tek bir String oluşturmak ve bu String'i ut değişkenine atamaktır.