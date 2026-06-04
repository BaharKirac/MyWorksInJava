package aarrays;

public class Example {
    public static void main(String[] args) {
        String [] students = new String[3];
        students[0] = "Bahar";
        students[1] = "ali";
        students[2] = "Ece";
//for dongusu ile dizinin icini dolasiyoruz -length ile
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
