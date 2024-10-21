package aarrays2_Collections;

public class MatrisEksmpl {
    public static void main(String[] args) {
        int[][] tabel = new int[4][4];
        tabel[0][0] = 23;
        tabel[1][0] = 25;
        tabel[2][3] = 45;

        for (int i =0; i< tabel.length; i++){
            for (int j=0; j< tabel[i].length; j++){
                System.out.print(tabel[i][j]+" ");
            }
        }

        System.out.println();
//for each dongusu ile de yapilabilir
        for (int[] liste : tabel){
            for (int tall : liste){
                System.out.print(tall+" ");
            }
        }
    }
}
