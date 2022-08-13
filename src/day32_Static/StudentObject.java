package day32_Static;

import java.sql.SQLOutput;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 =new Student("İhsan",'M',18);
        Student student2 = new Student("Ali",'F');
        Student student3 = new Student("ihsan",455,'A');
        Student student4 = new Student("Beyza",'F',155,'M',18);

        System.out.println(student2);
        System.out.println(student1);
        System.out.println(student3);
        System.out.println(student4);
    }
}
