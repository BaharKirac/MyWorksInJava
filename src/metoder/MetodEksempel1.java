package metoder;

//Bir karviziti "kartvizitim()" isimli metod icerisinde olusturup, ana programda gosteren programi kodlayiniz:
class Kartvizit{
    //?static metod ile

    /*static void kartvizitim(){
        System.out.println("Dr.Bulent Cobanoglu");
        System.out.println("Erzincan"+"\n"+"12345678");
    }*/
    //? sinif ismi bir degiskene yani nesneye aktarilarak yapilan static olmayan void metod ile:

    void kartvizitim(){
        System.out.println("Dr.Bulent Cobanoglu");
        System.out.println("Erzincan"+"\n"+"12345678");
    }
}
public class MetodEksempel1 {
    public static void main(String[] args) {
        // siniftan nesne olusturmaliyiz static yapmayinca
        Kartvizit nesne = new Kartvizit();
        nesne.kartvizitim();
        //Kartvizit.kartvizitim();
    }
}

