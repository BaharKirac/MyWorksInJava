package aarrays;

/* dizide boş (null) olan
elemanlarla nasıl başa çıkılacağını gösteriyor */
class Person{
    public String navn;
    public int alder;
}
public class AarraysNullPek {
    public static void main(String[] args) {
        Person[] liste= new Person[3];
        Person ole = new Person();
        ole.navn = "Ole";
        ole.alder = 23;
        liste[0]=ole;

        Person line= new Person();
        line.navn = "Line";
        line.alder = 34;
        liste[1] = line;

        for (int i=0; i< liste.length; i++){
            if (liste[i] != null) { //null kontrolu yapiliyor,olan elemanlar atlanarak yazdırma işlemi yalnızca dolu nesneler için gerçekleştirilmiş.
                System.out.println(liste[i].navn+" "+liste[i].alder);
            }
        }
    }
}
