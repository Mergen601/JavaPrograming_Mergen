package day39_Recap.cydeoTask;

import day37_Inheritance.ScrumTask.Developer;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Cydeo {

    public static void main(String[] args) {

        Developers developers = new Developers("İhsan",18,'M',1820,"Developer",40000.000);

        Tester tester = new Tester("İhsan",18,'F',1820,"Sdet",1450);

        Teacher teacher = new Teacher("Asya",18,'F',1801,40000.00);

        Student student = new Student("İhsan",19,'M',1501,"Sdet");


        System.out.println(developers);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);


        System.out.println("-------------------------------");

        developers.work();
        tester.drink();
        developers.fixingBugs();
        teacher.work();
        tester.createTicket();



    }
}
