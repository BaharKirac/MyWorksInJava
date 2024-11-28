package plenums;

import java.util.HashMap;

public class Plenum12 {

    String [] handleliste =  new String[10];

    public void  addElement (String str){
        for (int i=0; i<handleliste.length; i++){
            if (handleliste[i] == null){
                handleliste[i] = str;
                return;
            }
        }

        String [] handlelisteClone = new String[handleliste.length +1];
        for (int i=0; i<handleliste.length; i++){
            handlelisteClone[i] = handleliste[i];
        }
        handleliste = handlelisteClone;
        handleliste[handleliste.length-1] = str;
    }

    public void removeElement(int pos){
        handleliste[pos] = null;
    }
    public static void main(String[] args) {
        Plenum12 handlelistt = new Plenum12();
        handlelistt.addElement("Gummihansker");
        handlelistt.addElement("Sylteagurk");
        handlelistt.addElement("Duct tape");
        handlelistt.addElement("Marshmallows");
        handlelistt.addElement("Hegenisse");
        handlelistt.addElement("Kvikk lunsj");
        handlelistt.addElement("Stor presenning");
        handlelistt.addElement("Ballonger");
        handlelistt.addElement("WD-40");
        handlelistt.addElement("VekkerKlokke");
        handlelistt.addElement("Surstromming");

        // fant marshmellows
        handlelistt.removeElement(4);
        // kom på at man også trengte pølser og lomper
        handlelistt.addElement("Pølser");
        handlelistt.addElement("Lomper");

        System.out.println(handlelistt);
    }
}
