package task2;

public class SkateBoard extends Collection {
    private  String model;
    private String mainMaterial;

    public SkateBoard(String name, String description, int year, double price, String condition, String model, String mainMaterial) {
        super(name, description, year, price, condition);
        this.model = model;
        this.mainMaterial = mainMaterial;
    }

    @Override
    public String toString() {
        return "SkateBoard{" +
                "model='" + model + '\'' +
                ", mainMaterial='" + mainMaterial + '\'' +
                '}';
    }
}
