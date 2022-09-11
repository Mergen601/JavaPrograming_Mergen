package day37_Inheritance.ScrumTask;

public class Tester extends  Employee{

    public Tester(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Tester", salary, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle+ "is creating ticker");
    }
}
