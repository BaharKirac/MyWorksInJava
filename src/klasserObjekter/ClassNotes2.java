package klasserObjekter;

//METODE MED INNPARAMETER(int).RETURNERER VERDI(int):
class PersonB{
    public String navn;
    public int fødselsårr;

    public int alder(int årstall){
        int alder = årstall - fødselsårr;
        return alder;
    }
}
public class ClassNotes2 {
    public static void main(String[]args){
        PersonB person03 = new PersonB();
        person03.navn = "Line Jensen";
        person03.fødselsårr = 1999;
        int alder = person03.alder(2019);
        System.out.print(person03.navn+" er "+alder+" år.");
    }
}


//METODE MED TO INNPARAMETERE OG RETURNERER VERDI(int),INGEN ATTRIBUTTER:
/*class Bil01 {
    //ingen attributter
    public double rekkevidde(double tank,double forbruk){
        double rekkevidde = tank / forbruk;
        return rekkevidde;
    }
}

public class ClassNotes2 {
    public static void main(String[]args){
        Bil01 volvo = new Bil01();
        double rekkevidde = volvo.rekkevidde(80,0.8);
        System.out.print("Rekkevidden til bilen er ");
        System.out.print(rekkevidde+" mil.");
    }
}*/