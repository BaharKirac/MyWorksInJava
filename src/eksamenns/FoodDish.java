package eksamenns;

import java.util.ArrayList;

public class FoodDish {
    private String name;
    private ArrayList<Ingrendient> ingrendients;
    private static int dishesServed = 0;

    public FoodDish(String name){
        this.name = name;
        ingrendients = new ArrayList<>();
    }

    public void addIngredient(Ingrendient ingrendient) {
        ingrendients.add(ingrendient);
    }

    public void printReceipe(){
        for (Ingrendient ingrendient : ingrendients){
            System.out.println(ingrendient);
        }
    }

    public void serveDish(){
        dishesServed++;
    }
}
