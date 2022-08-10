package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObject
{
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Ali",1805014,'M',"Calculator",6000,true);

        Employee employee2 = new Employee();
        employee2.setInfo("Fatih",1805013,'M',"Driver",6600,true);

        Employee employee3 = new Employee();
        employee3.setInfo("Ihsan",1805012,'M',"Sales Man",5500,false);

        Employee employee4 = new Employee();
        employee4.setInfo("Salim",1805011,'M',"Engineer",8000,true);

        Employee employee5 = new Employee();
        employee5.setInfo("Soner", 1805010,'M',"Electric",7000,false);


        Employee []  employees = {employee1,employee2,employee3,employee4,employee5};
        System.out.println(Arrays.toString(employees));

        System.out.println("-----------------------------");

        ArrayList<Employee> isFullTime = new ArrayList<>();
        ArrayList<Employee> isPartTime = new ArrayList<>();

        for (Employee each : employees)
        {
            if(each.isFullTime==true)
            {
                System.out.println(each.name+  " : " +each.isFullTime);
            }
            else
            {
                System.out.println(each.name+  " : " +each.isFullTime);
            }
        };

        double maxSalary = employees[0].salary;
        double minimumSalary =employees[0].salary;
        for (Employee each : employees)
        {
            if(each.salary> maxSalary)
                maxSalary = each.salary;

        }
        for(Employee each : employees)
        {

            if (each.salary <minimumSalary)
            {
                minimumSalary = each.salary;
            }
        }


        System.out.println(maxSalary);
        System.out.println(minimumSalary);













    }
}
