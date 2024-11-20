package smartLamp;

public class Controller {
    static class SmartLight{
        public int brightnessPercentage;
        public boolean isOn;
        // Konstruktør (Constructor)
        public SmartLight(int brightnessPercentage, boolean isOn) {
            this.brightnessPercentage = brightnessPercentage;
            this.isOn = isOn;
        }
        // Standard konstruktør
        public SmartLight() {
            this.brightnessPercentage = 0; // Default brightness
            this.isOn = false; // Default av
        }
        // Getter for brightnessPercentage
        public int getBrightnessPercentage() {
            return brightnessPercentage;
        }
        // Setter for brightnessPercentage med validering
        public void setBrightnessPercentage(int brightnessPercentage) {
            if (brightnessPercentage < 0 || brightnessPercentage > 100) {
                throw new IllegalArgumentException("Brightness must be between 0 and 100.");
            }
            this.brightnessPercentage = brightnessPercentage;
        }
        // Getter for isOn
        public boolean isOn() {
            return isOn;
        }
        // Setter for isOn
        public void setOn(boolean on) {
            isOn = on;
        }
    }

    static class SmartLamp{
        public SmartLight installedBulb;
        public String wifiName;
        // Konstruktør med alle parametere
        public SmartLamp(SmartLight installedBulb, String wifiName) {
            this.installedBulb = installedBulb;
            this.wifiName = wifiName;
        }
        // Overloading: Konstruktør uten lyspære
        public SmartLamp(String wifiName) {
            this.installedBulb = null; // Ingen lyspære installert
            this.wifiName = wifiName;
        }
        // Getter for installedBulb
        public SmartLight getInstalledBulb() {
            return installedBulb;
        }
        // Setter for installedBulb
        public void setInstalledBulb(SmartLight installedBulb) {
            this.installedBulb = installedBulb;
        }
        // Getter for wifiName
        public String getWifiName() {
            return wifiName;
        }
        // Setter for wifiName
        public void setWifiName(String wifiName) {
            this.wifiName = wifiName;
        }

        // Metode for å sette lysstyrken til den installerte lyspæren
        public void setBrightness(int brightness) {
            if (installedBulb != null) {
                installedBulb.setBrightnessPercentage(brightness);
                System.out.println("Brightness set to " + brightness + "%.");
            } else {
                System.out.println("No bulb installed in the lamp.");
            }
        }
    }
}
