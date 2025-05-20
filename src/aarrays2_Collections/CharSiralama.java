package aarrays2_Collections;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class CharSiralama {
    public static void main(String[] args) {
        char A[]={'i','s','t','a','n','b','u','l'};
        Arrays.sort(A); //? diziyi sirala

        //? sirali diziyi ekrana yaz

        for (int i=0; i<A.length; i++){
            System.out.printf("%c ",A[i]);
        }
    }
}
