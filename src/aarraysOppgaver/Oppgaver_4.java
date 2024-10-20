package aarraysOppgaver;

/* Definer følgende heltallsarray :
45, 34, 5, 8, 10, 2, 13, 25.
Lag et program som skriver ut tallene baklengs.
(Dvs. 25, 13, 2 osv.) med en for-løkke. Tips:
Start fra array.length - 1 så lenge telleren
i for-løkka er større eller lik 0.
Mink telleren med en hver gang */
public class Oppgaver_4 {
    public static void main(String[] args) {
        int[] numbers = {45, 34, 5, 8, 10, 2, 13, 25}; //numbers isimli bir int dizisi tanımlanıyor.
        for (int i = numbers.length-1; i>=0; i--){
            System.out.print(numbers[i]+", ");
        }
    }
}

/* numbers.length - 1 ifadesi, dizinin son indeksini temsil eder.
i-- ifadesi, her adımda indeksin bir azalmasını sağlar.
Böylece dizide geriye doğru gidilir.
 Döngü içinde, numbers[i] ile dizinin her bir elemanı yazdırılır.
 Bu, döngü sırasındaki i değerine bağlıdır.
 İlk olarak i = 7 olduğunda, numbers[7] yani 25 yazdırılır,
 sonra i = 6 olduğunda numbers[6] yani 13 yazdırılır.
 Bu süreç dizinin ilk elemanına kadar devam eder.*/