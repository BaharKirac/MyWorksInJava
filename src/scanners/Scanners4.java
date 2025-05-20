package scanners;

import java.util.Scanner;

public class Scanners4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yasiniz giriniz");
        int yas = scanner.nextInt();
        System.out.println("adinizi giriniz");
        if (scanner.hasNextLine()){
            String ad = scanner.nextLine();
            System.out.println("adiniz "+ ad);
        }else {
            System.out.println("yanlis");
    }
}}
