package løkker;

//1 NOK 4.58 dolar, buna gore TL/DOLAR donusumu yapacak prog. kodla:
public class Eksempel2 {
    public static void main(String[] args) {
        int nok;
        double dollar;
        //System.out.println("1 Nok "+nok+ " er "+dollar);

        for (nok=1; nok<11; nok++){
            dollar = nok * 1;
            System.out.println(nok+"\t"+dollar);
        }
    }
}
