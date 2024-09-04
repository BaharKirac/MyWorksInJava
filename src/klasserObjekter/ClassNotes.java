package klasserObjekter;

/*class PersonE{
    //parametere inn med type og variabel navn:
    public String navn (String fornavn, String etternavn){
        String navn = fornavn + " " + etternavn;
        return  navn; //navn variabelen returneres:
    }
}
public class ClassNotes {
    public static void main (String[]args){
        PersonE enPerson = new PersonE(); //oppretter et objekt fra klassen
        String etNavn = enPerson.navn("Lene", "jensen"); //kaller metoden i objekt med to parametere
        System.out.println(etNavn);
    }
} */


//METODE UTEN INNPARAMETER.RETURNERER INGENTING(VOID)
/*class Personn{
    public String navn;
    public int fødselsår;

    public void alder(){
        int alder = 2024 - fødselsår;
        System.out.println(alder+" år ");
    }
}
public class ClassNotes {
    public static void main (String[]args){
        Personn person01 = new Personn();
        person01.navn = "Line Jensen";
        person01.fødselsår = 1999;
        System.out.print(person01.navn+ " er ");
        person01.alder();

    }
}
*/

//METODE UTEN INNPARAMETER. MEN RETURNERER VERDI(int):
class PersonA {
    public String navn;
    public int fødselår;

    public int alder(){
        int alder = 2024 - fødselår;
        return alder;
    }
}
public class ClassNotes {
public static void main (String [] args){
    PersonA person02 = new PersonA();
    person02.navn = "Line Jensen";
    person02.fødselår = 1999;
    int alder = person02.alder();
    System.out.print(person02.navn+" er "+alder+" år ");
}
}