package userMenu;

import java.util.Scanner;

public class Controller {
public static void runMenu(){
    Scanner scanner = new Scanner(System.in);
    int valg = 0;
    while (valg !=3){
        System.out.println("\nVelg et alternativ:");
        System.out.println("1: Motta dagens visdomsord");
        System.out.println("2: Se dagens vær");
        System.out.println("3: Avslutte programmet");
        System.out.println("Skriv inn ditt valg (1-3): ");
        if (scanner.hasNextInt()){
            valg = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Ugyldig valg. Vennligst skriv inn et tall mellom 1 og 3.");
            scanner.nextLine();
            continue;
        }
        //kullanici secimine gore islem yap
        switch (valg){
            case 1 -> displayWordofWisdom();
            case 2 -> displayWeather();
            case 3 -> exitProgram();
            default -> System.out.println("Ugyldig valg. Vennligst velg mellom 1 og 3.");

        }
    }
    scanner.close(); //kaynak kapatilir
}
public static void displayWordofWisdom(){
    System.out.println("Her er dagens visdomsord: Gjør det beste ut av hver dag! ");
}
public static void displayWeather(){
    System.out.println("Dagens vær: Sol og 15 grader. ");
}

public static void exitProgram(){
    System.out.println("Programmet avsluttes. Ha en fin dag!");
}}