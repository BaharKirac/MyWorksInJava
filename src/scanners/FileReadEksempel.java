package scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadEksempel {
    public static void main(String[] args) {
        try {
            // Dosya nesnesi oluşturuluyor
            File file = new File("input.txt");
            // Dosyayı okumak için Scanner kullanılıyor
            Scanner input = new Scanner(file);
            // Dosyadaki her satır sırayla okunuyor
            while (input.hasNextLine()){
                String line= input.nextLine();
                System.out.println(line);
// Scanner kapatılıyor
                input.close();
            }
        } catch (FileNotFoundException e){
            // Dosya bulunamadığında hata mesajı
            System.out.println("Dosya bulunamadi: "+e.getMessage());
        }
    }
}
