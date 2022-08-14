package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class CydeoStudent {

    public String name;
    public static  String schoolName;

    public CydeoStudent(String name)
    {
        this.name = name;
      //  this.schoolName =  "Cydeo School";
    }

    static {

        schoolName = "Cydeo School";
    }


}

class CydeostudentObject
{
    public static void main(String[] args) {

       CydeoStudent student = new CydeoStudent("İhsan");

        System.out.println(student.name);
        System.out.println(student.schoolName);
    }

}
