package arver;

import java.util.ArrayList;

class Animal{
    private boolean isBaby;

    public boolean isBaby() {
        return isBaby;
    }

    public void setBaby(boolean baby) {
        isBaby = baby;
    }

    public Animal(boolean isBaby) {
        this.isBaby = isBaby;
    }

    public String toString() {
        return "Animal{" +
                "isBaby=" + isBaby +
                '}';
    }
}
class Dog extends Animal{
    private String breed;
    public Dog(boolean isBaby, String breed) {
        super(isBaby);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
    public void animalSound(){
        if(isBaby()){
            System.out.println("Voff voff");
        } else{
            System.out.println("VOFF VOFF!");
        }}
}

class Cat extends Animal{
    private String favouritePlace;
    public Cat(boolean isBaby, String favouritePlace) {
        super(isBaby);
        this.favouritePlace = favouritePlace;
    }
    public String getFavouritePlace() {
        return favouritePlace;
    }

    public void setFavouritePlace(String favouritePlace) {
        this.favouritePlace = favouritePlace;
    }

    public void animalSound(){
        System.out.println("Miao");
    }
    @Override
    public String toString() {
        return "Cat{" +
                "favouritePlace='" + favouritePlace + '\'' +
                '}';
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        // Animal nesnesi ekleniyor
        Animal a = new Animal(false);
        animals.add(a);
        // Cat nesnesi oluşturulurken doğru parametreler sağlanıyor
        Cat cat =  new Cat(false,"Keyboard");
        animals.add(cat);
        // Dog nesnesi oluşturulurken doğru parametreler sağlanıyor
        Dog dog1 = new Dog(true,"Schaefer");
        animals.add(dog1);
        // Nesnelerin toString() metodları çağrılıyor
        for (Animal animal : animals){
            System.out.println(animal.toString());
        }

    }
}
