package klasserObjekter;

//sinif tanimlama class kelimesi ile
class Car {
    //Degisken-variable tanimlama
    public String color;
    String model;
    int year;

//Sinifin icinde metod tanimlama
    public void startEngine (){
        System.out.println("Engine started");
    }
    public void stopEngine(){
        System.out.println("Engine stopped");
    }
}
public class Objekter2 {

    //Car sinifindan bir nesne olusturma
    public static void main (String [] args){
        Car myCar = new Car();
        myCar.color = "red";
        myCar.model = "Tesla Model S";
        myCar.year = 2023;
//Nesneye ait metodlari kullanma
        myCar.startEngine();
        myCar.stopEngine();
    }
}
