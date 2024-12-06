package prøveeksamenn;

/* Lag en statisk metode som har et char-array som parameter. Metoden skal
returnere et char-array der elementene i arrayet har motsatt rekkefølge i forhold
til char-array metoden mottar via sin parameter. Bestem selv om metoden skal
være public eller private. Gjøre rede for hvilken konsekvens det har om du velger
private eller public */

import static prøveeksamenn.oppgve.reverse;

class oppgve{
    public static char[] reverse(char[] chars){
        char[] charsToreturn = new char[chars.length];
        int index= chars.length -1;
        for (int i=0; i<chars.length; i++){
            charsToreturn[i] = chars[index];
            index--;
        }
        return charsToreturn;
    }
}
public class Oppgave_03 {
    public static void main(String[] args) {
        System.out.println(reverse(new char[]{'a', 'b', 'c', 'a', 'b', 'c'}));
        System.out.println("Expecting empty array...");
        System.out.println(reverse(new char[]{}));
        System.out.println("Was it empty?");
    }
}
