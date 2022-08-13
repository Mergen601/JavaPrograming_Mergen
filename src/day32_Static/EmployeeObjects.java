package day32_Static;

public class EmployeeObjects {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.name = "Static";
        employee1.salary = 190000;

        Employee employee2 = new Employee();
        employee2.name = "Class";
        employee2.salary = 200000;

        Employee employee3 = new Employee();
        employee3.name  = "Cydeo";
        employee3.salary = 30000;


        System.out.println(employee1.name+ " : " +employee1.salary);
        System.out.println(employee2.name+ " : " +employee2.salary);
        System.out.println(employee3.name+ " : " +employee3.salary);

        System.out.println(employee1.name+ " : " +employee1.isHuman);






    }
}
