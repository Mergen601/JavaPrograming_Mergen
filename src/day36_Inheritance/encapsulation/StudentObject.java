package day36_Inheritance.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

        Student student = new Student("İhsan",20,'F','D');
        Student student1 = new Student("Enver",18,'M','A');
        Student student2 = new Student("Kamer",17,'M','C');

        student.isPlaying();

        ArrayList<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(student,student1,student2));

        for (Student each : students) {

            System.out.println( each.getName()+ ": "+each.getGrade());
        }

    }
}
