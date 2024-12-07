package aarrays2_Collections;

import static java.util.Arrays.sort;

public class CharSiralama {
    public static void main(String[] args) {
        char A[]={'i','s','t','a','n','b','u','l'};
        sort(A); //? diziliyi sirala

        //? sirali diziyi ekrana yaz

        for (int i=0; i<A.length; i++){
            System.out.printf(" ",A[i]);
        }
    }
}
