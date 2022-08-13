package day32_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {

}

    class Tester {
        public String name;
        public int employeeID;
        public String jobTitle;
        public double salary;

        public Tester(String name, int employeeID, String jobTitle, double salary) {
            this.name = name;
            this.employeeID = employeeID;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        public String toString() {
            return "Tester{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public void smokeTesting()
        {
            System.out.println(name+ " is smoking");
        }
        public void creatingTicket()
        {
            System.out.println(name+ " is creating ticket");
        }



    }


    class Developer {

        public String name;
        public int employeeID;
        public String jobTitle;
        public double salary;

        public Developer(String name, int employeeID, String jobTitle, double salary) {
            this.name = name;
            this.employeeID = employeeID;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        public String toString() {
            return "Developer{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }

    }



    class ScrumTeam
    {
        public String PO,BA,SM;
        public ArrayList<day31_Constructors.ScrumTask.Tester> testerList = new ArrayList<>();
        public ArrayList<day31_Constructors.ScrumTask.Developer> developerList = new ArrayList<>();
        int dayOfSprint;


        public ScrumTeam(String PO, String BA, String SM, int dayOfSprint) {
            this.PO = PO;
            this.BA = BA;
            this.SM = SM;
            this.dayOfSprint = dayOfSprint;
        }

        public void addTester(day31_Constructors.ScrumTask.Tester tester)
        {
            testerList.add(tester);
        }

        public void  addTesters (day31_Constructors.ScrumTask.Tester tester [])
        {
            testerList.addAll(Arrays.asList(tester));
        }

        public void addDeveloper(day31_Constructors.ScrumTask.Developer developer)
        {
            developerList.add(developer);
        }

        public void addDevelopers(day31_Constructors.ScrumTask.Developer developer[])
        {
            developerList.addAll(Arrays.asList(developer));
        }

        public void  removeTesters(int employeeID)
        {
            testerList.removeIf(p-> p.employeeID == employeeID);
        }

        public void  removeDevelopers(int employeeID)
        {
            developerList.removeIf(p-> p.employeeID  == employeeID);
        }

        public String toString() {
            return "ScrumTeam{" +
                    "PO='" + PO + '\'' +
                    ", BA='" + BA + '\'' +
                    ", SM='" + SM + '\'' +
                    ", testerList=" + testerList +
                    ", developerList=" + developerList +
                    ", Total number of testers = " +testerList.size()+
                    ", Total number of developers = "+developerList.size()+
                    ", dayOfSprint=" + dayOfSprint +
                    '}';
        }


    }

