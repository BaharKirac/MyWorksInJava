package klasserObjekter;

class PersonC{
    private int alder;

    /* public PersonC(int alder){
        if(alder>0){
            this.alder=alder;
        }
    } */
    public int getAlder(){
        return alder;
    }

    public void setAlder(int alder){
        if(alder>0){
            this.alder=alder;
        }
    }
}
public class GetSetMtd {
    public static void main(String[]args){
        PersonC personA = new PersonC();
        //personA.alder = 23;
        personA.setAlder(23);
        System.out.print("Alderen er "+personA.getAlder()+" år.");
    }
}

/* GET SET METODER
Atributlere deger atarken gelen veriyi kontrol edebilmemizi saglar.
attributleri dogrudan okumak,ayarlamak veya erismek yerine get set metodlariyla
attributlere degerler atar ve degerler aliriz.
attributlere deger atamak ve bu degerleri almak icin bu metodlari kullaniirz.
bir nesnenin niteliklerine kontrollü erişim sağlar.
Hangi değerlerin ayarlandığını doğrulayabilir veya sınırlayabilir ve
nesnenin dahili durumunu koruyabilir.
*Bir sınıftaki attributleri "privat" olarak ayarladığınızda,
bunlar sınıfın kendisindeki yöntemler dışında hiç kimse tarafından kullanılamaz.
Bu, verileri almak ve verileri bunlarda depolamak için "get" / "set" yöntemlerinin
oluşturulması gerektiği anlamına gelir.
Bunun nedeni ise set metodunda parametreye ne girildiğini kontrol edebiliyor olmanızdır.
Bu da yine bir attributte yalnızca yasal değerlerin olmasını sağladığınız anlamına gelir.
 */