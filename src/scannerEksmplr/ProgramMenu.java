package scannerEksmplr;

import java.time.LocalDate;
import java.util.Scanner;


public class ProgramMenu {
        // Ana çalışma metodu
        public void run() {
            Scanner scanner = new Scanner(System.in);
            int choice = 0;

            // Menü döngüsü
            while (choice != 3) {
                System.out.println("Pick a number (1-3)");
                System.out.println("1: Enter date");
                System.out.println("2: Do something else");
                System.out.println("3: Quit");

                // Kullanıcıdan seçim al
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Satır sonu karakterini temizle
                } else {
                    System.out.println("Please enter a valid number (1-3).");
                    scanner.nextLine(); // Geçersiz girdiyi temizle
                    continue;
                }

                // Seçimlere göre işlem yap
                switch (choice) {
                    case 1 -> enterDate();
                    case 2 -> doSomethingElse();
                    case 3 -> quit();
                    default -> System.out.println("Your options are 1-3");
                }
            }
            scanner.close(); // Kaynağı kapat
        }

        private void quit() {
            System.out.println("Bye!");
        }

        private void doSomethingElse() {
            System.out.println("Doing something else");
        }

        private void enterDate() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter date on format YYYY-MM-DD");
            String s = scanner.nextLine();

            try {
                LocalDate ld = LocalDate.parse(s); // Tarihi dönüştür
                System.out.println("Date was before now: " + ld.isBefore(LocalDate.now()));
            } catch (Exception e) {
                System.out.println("Invalid date format. Please try again.");
            }
        }
    }

