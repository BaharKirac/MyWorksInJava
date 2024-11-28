package plenums.bicyle;

public class Main {
    public static void main(String[] args) {
        //? Opprette to sykler
        Bicyle sikkel1 = new Bicyle(5,1);
        Bicyle sikkel2 = new Bicyle(20,4);
        //* Eksempel med tom konstruktør
        Bicyle sikkel3 = new Bicyle();

        // Gi dem noen verdier for attributtene sine
        // b1 og b2 har satt dem via konstruktør
        // for b3 bruker vi settere
        sikkel3.setSpeed(99);
        sikkel3.setGear(9);

        //* Sjekk om verdiene ble satt riktig
        System.out.println("Sikkel 1: ");
        sikkel1.displayStatus();
        System.out.println("Sikkel 2: ");
        sikkel2.displayStatus();
        System.out.println("Sikkel 3: ");
        sikkel3.displayStatus();
        //* Kall på metoder for å skifte gir og øke fart / bremse
        sikkel1.setGear(2);
        sikkel1.increaseSpeed(5);

        sikkel2.decreaseSpeed(19);
        sikkel2.setGear(1);
        // Sjekk om verdiene ble riktig oppdatert
        System.out.println("Sikkel 1 updated:");
        sikkel1.displayStatus();
        System.out.println("Sikkel 2 updated: ");
        sikkel2.displayStatus();

        // Eksempel på bruk av getter
        System.out.println("Sikkel 1 speed : "+sikkel1.getSpeed());
    }
}
