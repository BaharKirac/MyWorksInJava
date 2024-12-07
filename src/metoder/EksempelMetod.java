package metoder;

/* Metot Tanımı
Metot tanımlamak, bir işlevin (veya görevin) adını,
 ne tür bir değer döndüreceğini, hangi parametreleri alacağını
 ve hangi işlemleri gerçekleştireceğini belirlemektir.

 */
public class EksempelMetod {
    //! alinan sayinin kucuk olup olmadigini donduren yontem
    public String isNumberSmallMediumOrBig(int number){
        if (number<100){
            return "Small";
        }
        if (number<1000){
            return "Big";
        }
        return "Medium";

    }
//! tum kurs kodlarini donduren yontem
    public void printCourseName(String courseCode){
        switch (courseCode){
            case "ADTS1600" -> System.out.println("Interaksjondesign og prototyping");
            case "DAPE1400" -> System.out.println("Programmering");
            case "DATA1200" -> System.out.println("Web utvikling og inkluderende design");
            case "DATA1100" -> System.out.println("Teknolohi og samfunn for programmerere");
            default -> System.out.println("Unknown");
        }
    }
//! alinan renk dogru mu uygun mu
    public boolean isColorInNorwegianFlag (String color){

        //return color.equals("red") || color.equals("blue") || color.equals("white"); //kisa yolu

        if (color.equals("red")){
            return true;
        }
        if (color.equals("blue")){
            return true;
        }
        if (color.equals("white")){
            return true;
        }
        return false;

    }
//! stringlerin birlesik uzunlugunu donduren yontem
    public int combinedLength(String s1, String s2){
       //? return s1.length() + s2.length(); boyle de kullanabiliriz
        int sum = s1.length() + s2.length();
        return sum;
    }
    //! icinde belirli bir karakterin ilk gectigi konumu bulmak icin indexOf(char)
    //? indexOf(char) yontemi belirtilen karakterin string icindeki ilk konumunu dondurur. string icinde karakter yoksa -1 dondurur.
    public int firstOccurence(String string, char c){
        return string.indexOf(c);
    }
    //! string basindaki ve sonundaki bosluklari kaldirmak icin trim() yontemi
    public String ensureOnlySingleSpaceAtEndOfString(String string){
        return string.trim() + " ";
    }

    //! bir stringin uzunlugunu donduren yontem length();
    public boolean checkIfStringIsWithinCorrectLenghth(String string, int maxChar, int minChar){
       //?alternatif

        //return string.length()<=maxChar && string.length()>=minChar;

        if (string.length()>maxChar){
            return false;
        }
        if (string.length()< minChar){
            return false;
        }
        return true;
    }
//! arraydeki stringleri ekrana yazdiran yontem for dongusu ile
    public void  printAllStrings(String[] strings){
        //eger dizi elemanlarinin indeksine ihtiyac varsa klasik for dongusu kulan
        for (int i=0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
        //dizilerde dolasmak elemanlarini kullanmak icin de for each ile de olabilir
       /* for (String string : strings){ //dizideki herbir elemani alir string degiskenine atar
            System.out.println(string);
        } */
    }
//! verilen bir dizi icindeki tum sayilarin toplamini donduren yontem, yani dizi elemanlari arasinda dolasmak
    public int arraySum(int[] numbers){
        int sum = 0;
        for (int i : numbers){
            sum += i;
        }
        return sum;
    }
//! dizideki her eleman yazdiriliyor ancak sadece "corona" yazilan yazdirilmiyor, bir eleman eksik yani
    public  void printAllStringsNotCorona(String[] strings){
        for (String string : strings){
            if (!string.equals("corona")){
                System.out.println(string);
            }
        }
    }
    public static void main(String[] args) {
        EksempelMetod assignemnet = new EksempelMetod();
        System.out.println(assignemnet.isNumberSmallMediumOrBig(15));

        assignemnet.printCourseName("ADTS1600");
        assignemnet.printCourseName("tull");
        boolean inNorwegianFlag1 = assignemnet.isColorInNorwegianFlag("black");
        System.out.println("Black in Norwegian flag? "+inNorwegianFlag1);
       boolean inNorwegianFlag2 = assignemnet.isColorInNorwegianFlag("red");
        System.out.println("Black in Norwegian flag? "+inNorwegianFlag2);

        System.out.println(assignemnet.combinedLength("4","5"));
        System.out.println(assignemnet.firstOccurence("hello",'x'));
        String [] someString = {"dette", "gikk", "bra"};
        assignemnet.printAllStrings(someString);

    }

}

