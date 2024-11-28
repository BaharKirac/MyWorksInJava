package plenums;

class Båt {
    private String navn = "Boat";
    private boolean isbryter;

    public Båt(String navn, boolean isbryter) {
        this.navn = navn;
        this.isbryter = isbryter;
    }

    public String getNavn() {
        return this.navn;
    }

    public void setNavn(String navn) {
        if (validerNavn(navn)){
        this.navn = navn;
    }
}

private boolean validerNavn(String navn){
        return navn != null && !navn.trim().isEmpty();
}
private boolean isIsbryter(){
        return isbryter;
}

public void setIsbryter(boolean isbryter){
        this.isbryter = isbryter;
}

}
public class Plenum10 {
    public static void main(String[] args) {
        Båt mcBoatFace = new Båt("BoatyMcBoatface", true);
        System.out.println(mcBoatFace.getNavn());
    }
}
