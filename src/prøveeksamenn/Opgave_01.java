package prøveeksamenn;

/* Metoden public void investigateStringArray(String[] strings) skal:
• Skrive ut (System.out) alle strengene i arrayet strings som inneholder
bokstaven ’a’.
• Skrive ut (System.out) hvor mange tegn (chars) arrayet strings totalt in-
neholder.
• Skrive ut (System.out) hvor mange null-verdier arrayet strings inneholder.
Skriv metoden investigateStringArray slik at den fungerer som beskrevet oven-
for. Hint: i klassen String er det en metode contains som kan komme til nytte */

class InvestigateArray{
    public static void investigateStringArray(String[] strings) {
        int bokstaver =0;
        int nulls= 0;

        for (String s : strings){
            if (s != null){
                bokstaver += s.length();
                if (s.contains("a")){
                    System.out.println(s);
                }
            } else {
                nulls++;
            }
        }
        System.out.println("Total bokstaver: "+bokstaver);
        System.out.println("Total nulls : "+nulls);
    }
}
public class Opgave_01 {

    public static void main(String[] args) {
        String [] testArrayList = {"Apple","Orange","Grape","Avocado","Banana","silk", null};

        InvestigateArray.investigateStringArray(testArrayList);
    }
}
