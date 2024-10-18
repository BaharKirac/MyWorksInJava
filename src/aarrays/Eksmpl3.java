package aarrays;

/* Girilen rakam degerine gore yilin kacinci ayi oldugunu hesaplayip ekranda goster */
import java.util.Scanner;

public class Eksmpl3 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        String A[]={ "", "Januar", "Februar","Mars", "April", "Mai", "Juni", "Juli", "August", "September", "October", "November", "Desember" };

        tara = new Scanner(System.in);
        int måned;
        System.out.println("Skriv inn en måned");
        måned = tara.nextInt();

        if (måned>0 && måned<=12)
            System.out.print(måned+". måned.. : "+A[måned]);
        else
            System.out.print("Hatali ay numarasi!");

    }
}
