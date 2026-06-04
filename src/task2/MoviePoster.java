package task2;

public class MoviePoster extends Collection{
    private String filmTitle;

    public MoviePoster(String name, String description, int year, double price, String condition, String filmTitle) {
        super(name, description, year, price, condition);
        this.filmTitle = filmTitle;
    }

    @Override
    public String toString() {
        return "MoviePoster{" +
                "filmTitle='" + filmTitle + '\'' +
                '}';
    }
}
