package kontrolstrukturer;
import static javax.swing.JOptionPane.*;

/*
        A : 90 - 100
        B : 80 - 90
        C : 60 - 80
        D : 50 - 60
        E : 40 - 50
        F : 0 - 40
        */
public class SwitchEksempl2 {
    public static void main(String[] args) {
        String innPoeng = showInputDialog("Skriv inn antall poeng (0-100)");
        int poeng = Integer.parseInt(innPoeng);
        poeng = poeng / 10;
        switch (poeng){
            case 10:
            case 9:
                showMessageDialog(null, "A");
                break;
            case 8:
                showMessageDialog(null,"B");
                break;
            case 7:
            case 6:
                showMessageDialog(null,"C");
                break;
            case 5:
                showMessageDialog(null,"D");
                break;
            case 4:
                showMessageDialog(null,"E");
                break;
            default:
                showMessageDialog(null, "F");
                break;
        }
        //if ile
        /*if(poeng > 0 && poeng < 4){
            showMessageDialog(null, "F");
        }
        if(poeng >= 4 && poeng < 5){
            showMessageDialog(null, "E");
        }
        if(poeng >= 5 && poeng < 6){
            showMessageDialog(null, "D");
        }
        if(poeng >= 6 && poeng < 8){
            showMessageDialog(null, "C");
        }
        if(poeng >=8  && poeng < 9){
            showMessageDialog(null, "B");
        }
        if(poeng >= 9){
            showMessageDialog(null, "A");
        }*/
    }
}
