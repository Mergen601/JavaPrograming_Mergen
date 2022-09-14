package day39_Recap.cydeoTask;

public class Developers extends Employee{

    public Developers(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void fixingBugs(){
        System.out.println(getJobTitle()+" "+getName()+" fixing bugs");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is working");
    }

}
