package day35_Encapsulation.encapsulation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee= new Employee("",'h',100,2212);
        System.out.println(employee);

        Employee employee1 = new Employee("ihsan",'F',100,1000.0);


        ArrayList<Employee> employees= new ArrayList<>();
        employees.addAll(Arrays.asList(employee1,employee));
        System.out.println(employees);
    }
}
