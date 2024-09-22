package kontrolstrukturer;

public class IfStruktr {
    public static void main(String[] args) {
        int alder = 18;
        if (alder >= 18){
            System.out.println("Du er myndig");
        }
        if (alder < 18){
            System.out.println("Du er et barn");
        }
    }
}



/* Syntax
 Kodeord (uttrykk) {
  setninger som utføres;
  dersom uttrykket er sant;
}

Starter med { og slutter med }
Husk vanlige parenteser rundt uttrykket.
ikke ; etter utrykket, men inne i strukturen

 */

//SAMMENLIKNINGS OPERATORER
/*
== likhet
!= ikke likhet
> større enn
>= større eller lik
< mindre enn
<= mindre eller lik
*/

//Logiske Operatorer
/*
Disse logiske operatorene brukes i hovedsak i if-setninger og while-løkker.
 && (og)
 || (eller)
 ! (betyr NOT eller IKKE)

 *Ve (&&):

İki ifadenin de doğru (true) olması gerekir ki sonuç doğru (true) olsun.
 Aksi takdirde sonuç yanlış (false) olur.
Örnek:
true && true → true
true && false → false

*Veya (||):

İki ifadenin birinin doğru (true) olması yeterlidir ki sonuç doğru (true) olsun.
Sadece her iki ifade de yanlış (false) olursa sonuç yanlış olur.
Örnek:
true || false → true
false || false → false

*Değil (!=):

Eşit değildir operatörü olarak kullanılır. Bir ifadenin tersini alır,
yani doğruyu yanlışa, yanlışı doğruya çevirir.
Örnek:
!true → false
!false → true
 */