package day31_Constructors.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam
{
      public String PO,BA,SM;
      public ArrayList<Tester> testerList = new ArrayList<>();
      public ArrayList<Developer> developerList = new ArrayList<>();
      int dayOfSprint;


    public ScrumTeam(String PO, String BA, String SM, int dayOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.dayOfSprint = dayOfSprint;
    }

    public void addTester(Tester tester)
    {
        testerList.add(tester);
    }

    public void  addTesters (Tester tester [])
    {
        testerList.addAll(Arrays.asList(tester));
    }

    public void addDeveloper(Developer developer)
    {
        developerList.add(developer);
    }

    public void addDevelopers(Developer developer[])
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
