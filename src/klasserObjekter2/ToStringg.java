package klasserObjekter2;

class Person2{
    public String personnummer;
    public String navn;
    public String adresse;
    public String telefonnr;

    public String toString(){
        String ut = "Her er inneholdet i objektet:\n";
        ut+= "Personnummer : "+this.personnummer+"\n";
        ut+= "Navn : "+this.navn+"\n";
        ut+= "Adresse : "+this.adresse+"\n";
        ut+= "Telefonnummer : "+this.telefonnr+"\n";
        return ut;
    }
    //@Override
    /*public String toString() {
        return "Person2{" +
                "personnummer='" + personnummer + '\'' +
                ", navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telefonnr='" + telefonnr + '\'' +
                '}';
    }*/
}
public class ToStringg {
    public static void main(String[] args) {
        Person2 enPerson = new Person2();
        enPerson.personnummer = "123456789";
        enPerson.navn = "Marius";
        enPerson.adresse = "Osloveien 82";
        enPerson.telefonnr = "98765432";

        System.out.println(enPerson);
    }
}
