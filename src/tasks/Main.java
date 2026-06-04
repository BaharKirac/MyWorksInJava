package tasks;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>(); //array list olusturduk stuudent objesinden

        Student student1 = new Student("Alice", 18, "java");
        Student student2 = new Student("James" , 19 , "Java");
        Student student3 = new Student("Line" , 21, "Javascript");

        //olusturulan objeleri listeye ekledik add ile

        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (int i = 0; i < students.size(); i++) {
            students.get(i).displayStudentInfo();  //metod cagirarak listeyi dolasip elemanlari yazdiriyoruz
            System.out.println("--------");
           // System.out.println(students.get(i));
        }
// Sadece Java kursunu alan öğrencileri gösteriyoruz
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse().equals("Java")){
                students.get(i).displayStudentInfo();
            }

        }
// Yaşı 20'den büyük olan öğrencileri gösteriyoruz
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() > 20){
                students.get(i).displayStudentInfo();
            }
        }
    }
}
