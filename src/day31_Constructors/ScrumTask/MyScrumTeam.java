package day31_Constructors.ScrumTask;

import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        // 3 TESTER OBEJECT
        Tester tester1  = new Tester("İhsan",1850,"SDET",10000);
        Tester tester2 = new Tester("Ali",1851,"SDET",50000);
        Tester tester3 = new Tester("Fatma",1852,"SDET",75000);

        Tester testers  [] = {tester1,tester2,tester3};

        //4 DEVELOPER OBJECT
        Developer developer1 = new Developer("Bilgehan",1750,"Java Dev",45000);
        Developer developer2 = new Developer("İlyas",1751,"C Dev",75000);
        Developer developer3 = new Developer("Beyza",1752,"Python Dev",85000);
        Developer developer4 = new Developer("Fatma",1753,"Dev",85000);

        Developer developers [] = {developer1,developer2,developer3,developer4};


        //1ScrumTeam
        ScrumTeam scrumTeam1 = new ScrumTeam("Berkay","Yasemin","Hakan",14);
        scrumTeam1.addDeveloper(developer1);
        scrumTeam1.addTester(tester3);
        scrumTeam1.addDevelopers(developers);
        scrumTeam1.addTesters(testers);
        System.out.println(scrumTeam1);

        System.out.println("-------------------------------------------");

        for(Tester eachTesters : scrumTeam1.testerList)
        {
            System.out.println(eachTesters.name+ ": " +eachTesters.salary);
        }

        for(Developer eachDeveloper : scrumTeam1.developerList)
        {
            System.out.println(eachDeveloper.name+ ": "+eachDeveloper.salary);
        }

        scrumTeam1.removeTesters(1850);
        System.out.println(scrumTeam1);


    }
}
