package smartLamp;

public class mainProg {
    public static void main(String[] args) {
        // Opprett en SmartLight
        Controller.SmartLight light = new Controller.SmartLight(50, true);

        // Opprett en SmartLamp med en lyspære
        Controller.SmartLamp lamp = new Controller.SmartLamp(light, "MyWiFi");

        // Sett lysstyrken på den installerte lyspæren
        lamp.setBrightness(80);

        // Opprett en SmartLamp uten lyspære
        Controller.SmartLamp lampWithoutBulb = new Controller.SmartLamp("MyWiFi2");

        // Forsøk å sette lysstyrken uten installert lyspære
        lampWithoutBulb.setBrightness(50);
    }
}
