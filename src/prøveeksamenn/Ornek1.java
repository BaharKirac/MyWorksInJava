package prøveeksamenn;

/* Bir metot yazın: public void analyzeStringArray(String[] strings)

Bu metot şu görevleri yerine getirmelidir:

Dizideki tüm String’leri kontrol edin ve içinde e harfi geçenleri yazdırın.
Dizideki en uzun kelimeyi bulun ve ekrana yazdırın.
Dizide kaç tane null değeri olduğunu yazdırın.
Hint: String sınıfındaki contains ve length metodlarını kullanabilirsiniz. */
public class Ornek1 {
    /* contains metodu, Java'da String sınıfında bulunan bir metottur
    ve bir String içinde başka bir String'in bulunup bulunmadığını kontrol etmek için kullanılır. */

    public void analyzeStringArray(String[] strings){
        int nullCount = 0;
        String enUzunOrd = "";

        for (String str : strings){
            if (str != null){
                nullCount += str.length();
                if (str.contains("e")){
                    System.out.println(str);
                }
            } else {
                nullCount++;
            }
        }
        System.out.println("Total bokstaver: "+ enUzunOrd);
        System.out.println("Total nulls: "+nullCount);
    }
    public static void main(String[] args) {
        Ornek1 nesne = new Ornek1();
String [] streng = {"Hello","merhaba","arac",null};
        nesne.analyzeStringArray(streng);
    }
}
