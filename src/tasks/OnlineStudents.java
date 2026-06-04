package tasks;

public class OnlineStudents extends Student{
    private String zoomLink;

    public OnlineStudents(String name, int age, String course, String zoomLink) {
        super(name, age, course);
        this.zoomLink = zoomLink;
    }

    public String getZoomLink() {
        return zoomLink;
    }

    @Override
    public String toString() {
        return "OnlineStudents{" +
                "zoomLink='" + zoomLink + '\'' +
                '}';
    }
}
