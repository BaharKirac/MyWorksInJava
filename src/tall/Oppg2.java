package tall;


public class Oppg2 {
    public static  String montNameByNumber (int montNumber) {

       return switch (montNumber) {
           case 1 -> "Januar";
           case 2 -> "Februar";
           case 3 -> "Mars";
           case 4 -> "April";
           case 5 -> "Mai";
           case 6 -> "Juni";
           case 7 -> "Juli";
           case 8 -> "August";
           case 9 -> "September";
           case 10 -> "October";
           case 11 -> "November";
           case 12 -> "Desember";
           default -> "Ingen måned";
        };
    }

    public static void main(String[] args) {
        System.out.println(montNameByNumber(1));
        String monthName = montNameByNumber(3);
        System.out.println(monthName);
        monthName =  montNameByNumber(-1);
        System.out.println(monthName);
    }
}
