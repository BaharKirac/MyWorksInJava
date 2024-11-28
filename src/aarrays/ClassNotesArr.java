package aarrays;

/*  Array, aynı türden birden fazla veriyi sabit bir boyutla saklayabilen bir veri yapısıdır.
Java'da array'ler belirli bir boyuta sahiptir ve bellekte ardışık olarak yerleştirilir.
Array'lerin uzunluğu sabittir ve tanımlandığında değiştirilemez. Su sekilde tanimlanir:

   //*type[] arrayName = new type[arraySize];
* type: Dizide saklanacak veri tipi (örneğin, int, double, String).
* arrayName: Dizinin adı, herhangi bir geçerli değişken adı olabilir.
* arraySize: Dizinin boyutu, yani kaç eleman saklayacağı.
Diziler genellikle döngülerle birlikte kullanılır,
çünkü tüm elemanlar üzerinde işlem yaparken döngü kullanmak çok pratiktir.

* Bir dizinin kendisi bir nesnedir
 */
public class ClassNotesArr {
    public static void main(String[] args) {

        int[] numbers = new int[5]; // helltall sayi dizisi tanimlama

        double[] decimals = new double[3]; // desimal tall sayi dizisi tanimlama

        String[] names = new String[4]; //String dizisi tanimlama
        String[] utlånsobjekter = { "bok", "CD", "DVD", "spill" };

    }
}

/* Array'e Değer Atama:
Bir dizi oluşturulduktan sonra, elemanlarına indeks kullanarak değer atayabilirsiniz.
Diziler sıfırdan başlar, yani ilk elemanın indeksi 0'dır.
int[] numbers = new int[5];
numbers[0] = 10;  // Dizinin ilk elemanına 10 değeri atanıyor
numbers[1] = 20;  // İkinci eleman 20
numbers[2] = 30;  // Üçüncü eleman 30

Array'in Elemanlarına Erişim:
Dizinin elemanlarına indeks ile erişebilir ve
bu elemanları kullanabilirsiniz.
System.out.println(numbers[0]);  // İlk eleman olan 10'u yazdırır
System.out.println(numbers[1]);  // İkinci eleman olan 20'yi yazdırır

Array'in Boyutuna Erişim:
Bir dizinin boyutunu öğrenmek için .length özelliğini kullanabilirsiniz.
int length = numbers.length;  // numbers dizisinin uzunluğunu alır
System.out.println(length);   // 5 olarak yazdırır

Array'leri tanımlarken doğrudan değer atayabilirsiniz.
int[] numbers = {10, 20, 30, 40, 50};

 Çok Boyutlu Diziler:
Java, çok boyutlu dizilere de izin verir.
En yaygın kullanılan çok boyutlu dizi tipi iki boyutlu dizilerdir (matris gibi).
int[][] matrix = new int[3][3];  // 3x3 boyutunda bir matris
matrix[0][0] = 1;  // İlk satır, ilk sütun elemanına 1 atanıyor

*/