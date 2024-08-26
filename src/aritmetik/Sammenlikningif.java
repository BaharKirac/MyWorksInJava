package aritmetik;
import static javax.swing.JOptionPane.*;
public class Sammenlikningif {
    public static void main (String [] args){
        String innStreng1 = showInputDialog("Skriv inn tall1:");
        String innStreng2 = showInputDialog("Skriv inn tall2 : ");
        int tall1 = Integer.parseInt(innStreng1);
        int tall2 = Integer.parseInt(innStreng2);

        if ( tall1 == tall2 ){
            showMessageDialog(null,"Tall1 er lik tall2");
        }

        if ( tall1 !=  tall2 ){
            showMessageDialog(null,"Tall1 er ikke lik tall2");
        }

        if ( tall1 < tall2 ){
            showMessageDialog(null, "Tall1 er mindre enn tall2");
        }

        if ( tall1 > tall2 ){
            showMessageDialog(null, "Tall1 er større enn tall2");
        }

        if ( tall1 <= tall2 ){
            showMessageDialog(null, "Tall1 er mindre eller lik tall2");
        }

        if ( tall1 >= tall2 ) {
            showMessageDialog(null, "Tall1 er større eller lik tall2");
        }

    }
}
