package aarrays;

/* "0,1,2,3,4,5,5,4,3,2,1,0"seklindeki diziyi olusturup ekranda goster */
public class Eksmpl2 {
    public static void main(String[] args) {

        int z[] = new int[12];
        for (int i = 0; i<12; i++){
            if (i<6)
                z[i]=i;
            else z[i] = 11 - i;
            System.out.print(z[i]+" ");
        }
    }
}
