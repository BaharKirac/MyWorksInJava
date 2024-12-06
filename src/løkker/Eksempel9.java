package løkker;

public class Eksempel9 {
    public static void main(String[] args) {
        String[] menu= {"Pasta","Suppe","Laks","Kebab","Lahmacun","Cookies","Cheesecake"};
        System.out.print("Restoran menusundeki yemekler: ");
        for (int i=0; i<menu.length; i++){
            System.out.println("- "+menu[i]);
        }

    }
}
