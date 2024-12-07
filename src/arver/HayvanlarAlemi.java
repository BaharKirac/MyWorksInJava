package arver;

//!Polymorphism
class Hayvanlar{
    public void konus(){
        System.out.println("Ben bir hayvanim");
    }
}

class Inek extends Hayvanlar{
    public void konus() {
        System.out.println("moo");
    }
}

class Kedi extends Hayvanlar{
    public void konus() {
        System.out.println("Miyav");
    }
}

class Kopek extends Hayvanlar{
    @Override
    public void konus() {
        super.konus();
        System.out.println("Hav hav hav");
    }
}
public class HayvanlarAlemi {
    public static void main(String[] args) {
        Hayvanlar[] a = new Hayvanlar[3];
        a[0]=new Inek();
        a[1]=new Kedi();
        a[2]=new Kopek();

        for (int i=0; i<3; i++){
            a[i].konus();
        }
    }
}
