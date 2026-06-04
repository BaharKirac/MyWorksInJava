package task2;

public class SportsEquipment extends Collection{
    private String sport;
    private String  type;

    //constructor

    public SportsEquipment(String name, String description, int year, double price, String condition, String sport, String type) {
        super(name, description, year, price, condition);
        this.sport = sport;
        this.type = type;
    }

    @Override
    public String toString() {
        return "SportsEquipment{" +
                "sport='" + sport + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
