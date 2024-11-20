package exceptionHandling;

/* Bir exception, bir program çalışırken meydana gelen ve
programın normal akışını bozan bir olaydır.
Java'da, bir exception, bir nesne olarak temsil edilir ve
bu nesne hatayla ilgili bilgileri içerir.

*----Exception Nasıl Meydana Gelir?----*
Süreç:
Bir metotta hata meydana gelir: Örneğin, bir diziye sınırların dışında bir indeksle erişmeye çalıştınız.
Bir exception nesnesi oluşturulur: Bu nesne hatanın türünü, hata mesajını ve hatanın meydana geldiği yerle ilgili bilgileri içerir.
Exception fırlatılır: Java, exception'ı programın akışında yukarıya doğru fırlatır (throw).
Exception yakalanır veya program sonlanır:
Eğer bir try-catch bloğu varsa, exception yakalanır ve yönetilir.
Eğer yoksa, exception çağrı yığını (call stack) boyunca yukarı fırlatılmaya devam eder ve sonunda program sonlanır.

*----Call Stack Nedir?----*
Call Stack, program çalışırken hangi metodun çağrıldığını takip eder.
Bir exception oluştuğunda, Java çağrı yığını boyunca yukarı doğru ilerler ve
exception'ı yakalayabilecek bir try-catch bloğu arar.
MethodC içinde bir hata meydana geliyor,
ancak bu metotta exception'ı yakalayacak (try-catch) bir yapı yok.
Exception, MethodB'ye fırlatılır.
Eğer MethodB'de de exception yakalayacak bir mekanizma yoksa, hata MethodA'ya fırlatılır.
Eğer MethodA içinde bir try-catch bloğu varsa,
exception burada yakalanır ve işlem yapılır.
Aksi takdirde, exception main metoduna kadar ilerler.
Eğer exception main metodunda da yakalanmazsa, program sonlanır ve Java bir hata mesajı verir.

*----NullPointerException----*
null değerine sahip bir referansın bir metot veya alanına erişilmeye çalışılması durumunda ortaya çıkan hata.
Ne Zaman Meydana Gelir?
Bir değişken veya nesne null iken:
Bir metoda erişim yapılmaya çalışıldığında.
Bir değişkene değer atanmaya çalışıldığında.
Bir alanına erişim yapılmaya çalışıldığında.

*-----ArithmeticException----*
Matematiksel bir işlem sırasında meydana gelen hata.
Ne Zaman Meydana Gelir?
Aritmetik bir işlem geçersiz olduğunda:
Bir sayıyı sıfıra böldüğünüzde (int a = 10 / 0;).
Sayılar dışında bir veri türüyle işlem yapmaya çalıştığınızda

*-----IllegalArgumentException----*
Bir metoda geçersiz veya uygunsuz bir argüman sağlandığında meydana gelen hata.
Ne Zaman Meydana Gelir?
Bir metodun beklediği parametre dışında bir değer gönderildiğinde.
Örneğin, negatif bir değer beklenmezken negatif bir argüman sağlanırsa.

*----IndexOutOfBoundsException----*
Bir dizide veya listede geçersiz bir indekse erişim sağlandığında oluşan hata.
Ne Zaman Meydana Gelir?
Bir dizinin veya listenin sınırları dışında bir indekse erişilmeye çalışıldığında:
Negatif bir indeksle erişim.
Dizi boyutundan büyük bir indekse erişim.

*----IO: Input/Output (Giriş/Çıkış)---*
IOException: Giriş-çıkış işlemlerinde meydana gelen genel bir hata.
Ne Zaman Meydana Gelir?
Dosya okuma/yazma işlemleri sırasında bir hata oluştuğunda.
Örneğin:
Yazılacak dosya korumalıysa.
Bir ağ bağlantısı sırasında veri akışı kesilirse.

*---Exception-Objekt Metotları---*
---getMessage()---
Bu metot, meydana gelen exception ile ilgili hata mesajını döndürür.
----printStackTrace()----
Bu metot, exception'ın nerede ve hangi satırda
meydana geldiğini gösteren bir hata izi (stack trace) yazdırır.

*****Håndtere Unntak (Exception Yönetimi)*****
Java'da exception'lar şu yapılarla yönetilir:

A- *___try-catch-finally Blokları___*
try: Hatalı olabilecek kodu yazarız.
catch: Hata meydana geldiğinde, exception'ı burada yakalarız.
finally: Hata olsa da olmasa da çalışır; genellikle kaynakları serbest bırakmak için kullanılır.
Örnek:
code
try {
    int result = 10 / 0; // ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Bir hata oluştu: " + e.getMessage());
} finally {
    System.out.println("Bu blok her zaman çalışır.");
}

B- *___throws ile Exception Fırlatma___*
Bir metodun exception fırlatabileceğini belirtir.
Kullanıcı bu exception'ı ele almak zorundadır.
Örnek:
code
public void readFile() throws FileNotFoundException {
    File file = new File("file.txt");
    Scanner scanner = new Scanner(file);
}
*/
public class ExceptionHandling {
    public static void main(String[] args) {
        String str = null; // null referansı
        System.out.println(str.length()); // NullPointerException

    }
}
