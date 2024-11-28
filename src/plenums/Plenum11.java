package plenums;

import static javax.swing.JOptionPane.*;
class Robot {
    String navn;
    int batteri;

    public Robot(String navn, int batteri) {
        this.navn = navn;
        this.batteri = batteri;
    }

    public void hondterHendelse(String hendelse) {
        switch (hendelse) {
            case "stein":
                batteri -= 10;
                break;
            case "batteri":
                batteri += 20;
                break;
            case "menneske":
                batteri -= 30;
                break;
            default:
                showMessageDialog(null, "Skriv inn rett da vel, skal være stein eller menneske eller batteri:");
        }
        showMessageDialog(null, "du har " + this.batteri + "batter igjen");
    }

    public boolean tomForBatteri() {
        if (batteri<=0){
            return  true;
    }
        return false;

}}
public class Plenum11 {
    public static void main(String[] args) {
        Robot robot = new Robot("GlassKanon-9000", 100);
        while (!robot.tomForBatteri()){
            String hendelse = showInputDialog("Skriv inn enten stein, menneske, batteri");
            robot.hondterHendelse(hendelse);
        }
        showMessageDialog(null, "Game over!");
    }
}
