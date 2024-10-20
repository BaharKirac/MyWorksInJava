package aarrays2_Collections;

/* Tabeller(matris) iki boyutlu tablolardir. matris de denir.
int [][] tabell = new int[][]; bu sekilde tanimlanir 2 boyutlu diziler.
tablonun kac satir kac sutun olacagini belirtir.
birinci dizi satir, ikinci dizi sutun.

bunu bir array dizisi yani liste olarak da tanimlayabiliriz.
int [][] tabell1 = {{1,2,3}, {2,4,6},{8,10,12}};
 */
public class Matris {
    public static void main(String[] args) {
        /*int [][] tabell = new int[3][3];
        tabell[0][0]=1;
        tabell[0][1]=2;
        tabell[0][2]=3;
        tabell[1][0]=2;
        tabell[1][1]=4;
        tabell[1][2]=6;
        tabell[2][0]=8;
        tabell[2][1]=10;
        tabell[2][2]=12;*/

        int [][] tabell1 = {{1,2,3}, {2,4,6},{8,10,12}};
        //liste olarak tanimlanmasi array dizisi gibi
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.println(tabell1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
