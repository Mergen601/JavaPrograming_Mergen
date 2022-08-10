package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Beyza",'F',18,18050,'A');


        Student student2 = new Student();
        student2.setInfo("İhsan",'M',22, 18051,'A');

        Student student3 = new Student();
        student3.setInfo("Tuğba",'F',23,18052,'B');

        Student student4 = new Student();
        student4.setInfo("Fatma", 'F',21,18053,'A');

        Student [] students = {student1,student2,student3,student4};

        for (Student each : students)
        {
            System.out.println(each);
        }

        System.out.println("-------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>();//earlyBirds
        ArrayList<Student> angryBirds = new ArrayList<>(); // angryBirds


        for(Student each : students)
        {
            if(each.grade == 'A')
            {
                earlyBirds.add(each);
            }
            else
            {
                angryBirds.add(each);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);







    }
}
