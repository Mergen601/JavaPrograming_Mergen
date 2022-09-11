package day37_Inheritance.ScrumTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Developer", salary, companyName);
    }

    public void fixBug(){
        System.out.println(name+" "+jobTitle+" is fixing bugs");
    }
}
