package aarrays2_Collections;

public class TersSiraArray {
    public static void main(String[] args) {
        char A[] = {'a','b','c','d','e','f','g','h','i','j'};
        char B[] = new char[10];
        System.out.printf("B[10]=");

        for (int i=0; i<=9; i++){
            B[i]=A[9-i]; //? A dizisini B dizisine tersten kopyaliyor
            System.out.printf("\t%c",B[i]);
        }
    }
}
