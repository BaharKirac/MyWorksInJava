package task2;

public class Collection {
    private String name;
    private String description;
    private int year;
    private  double price;
    private String condition;
    // Constructor
    public Collection(String name, String description, int year, double price, String condition) {
        this.name = name;
        this.description = description;
        this.year = year;
        this.price = price;
        this.condition = condition;
    }
    // Getter metodları
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", condition='" + condition + '\'' +
                '}';
    }
}
