package kontrolstrukturer;

public class SwitchEks1 {
    public static void main(String[] args) {
        String mounth = "Januar";


        if (mounth.equals("desember") || mounth.equals("januar") || mounth.equals("februar")){
            System.out.println(mounth + " er en vintermåned");
        } else if (mounth.equals("mars") || mounth.equals("april") || mounth.equals("mai")) {
            System.out.println(mounth + " er en vårmåned");
        } else if (mounth.equals("juni") || mounth.equals("juli") || mounth.equals("august")) {
            System.out.println(mounth + " er en sommermåned");
        }
    }
}
