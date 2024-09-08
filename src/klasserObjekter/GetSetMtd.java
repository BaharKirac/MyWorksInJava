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
 */