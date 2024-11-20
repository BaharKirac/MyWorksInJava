package exceptionHandling;

/*
*----Dosya Okuma ve Yazma için Temel Bilgiler----*
Dosyayı Proje Dizini veya Alt Dizinlerde Saklayın:
Örneğin;
-dosya proje kök dizinindeyse:-
code
File file = new File("dosya.txt");
-Eğer alt bir dizindeyse:-
code
File file = new File("klasör/dosya.txt");

*---FileWriter ile Dosyaya Yazma:----*
code
FileWriter writer = new FileWriter("output.txt");
writer.write("Merhaba Dünya!\n");
writer.write("Java ile dosya yazma işlemi tamamlandı.");
writer.close();
Bu kod output.txt adında bir dosya oluşturur ve belirtilen içeriği yazar.

*----Sayı veya Nesne Yazma (toString)----*
Metin dışındaki veriler de dosyaya yazılabilir. Ancak nesneleri önce bir metne dönüştürmelisiniz.
Her nesnenin bir toString() metodu vardır; bu, nesneyi metne dönüştürür.
Örnek:
code
LocalDate date = LocalDate.now();
FileWriter writer = new FileWriter("output.txt");
writer.write("Bugünün tarihi: " + date.toString());
writer.close()
*/
public class FilPlassering {
}
