package october29;

import java.util.Date;

public class October29 {
    public static void main(String[] args) {
        Date date = new Date();
        //Tarih= "29/ekim"1929" formatinda tarihi al
        String dato = String.format("dato: %te/%tB/%tY%n",date,date,date);
        String måned = String.format("%tb",date);
        String dag = String.format("%te",date);
        System.out.println(dato);
        //eger aylardan Ekim ve gunlerden 29 ise kutlama mesajini yaz...
        if (måned.equals("November") && dag.equals("28")){
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX\n"
                    +"X                                X\n"
                    +"X Cumhuriyet   Bayraminiz        X\n"
                    +"X     Kutlu       Olsun          X\n"
                    +"X                                X\n"
                    +"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        }
    }
}