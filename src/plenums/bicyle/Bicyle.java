package plenums.bicyle;

public class Bicyle {
    //* To attributter: speed og gear. La de være public.
    private  int speed;
    private int gear;
    //* Eksempel på tom konstruktør
    public Bicyle() {
    }
    //* Konstruktør
    public Bicyle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    //* gettere og settere
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newGear) {
        gear = newGear;
    }

    //* Metode for å øke farten. Parameter: Hvor mye økning

    public void increaseSpeed(int increase){
        speed = speed + increase;
    }

    //* Metode for å senke farten. Parameter: Hvor mye senkning

    public void decreaseSpeed(int decrease){
        speed = speed-decrease;
    }

    //* Metode for å vise tilstanden til objektet

    public void displayStatus(){
        System.out.println("Speed: "+speed+" Gear: "+ gear);
    }
}
