package day05_Concatenattion;

public class FullName
{
    public static void main(String[] args)
    {
        String firstName = "İhsan Enver";
        String lastName = "Kaşgarlı";
        String fullName= firstName + " " + lastName;
        String jobTitle = "Engineer";
        String companyName= "Cydeo";
        int age = 22;
        float salary = 15000f;


        //full name of person is ____;
        System.out.println("Full name of the person is " +fullName+".");
        //_____ is ____ years old;
        System.out.println(fullName + " is " +age+ " years old. ");
        //He is _____,He is working at;
        System.out.println("He is " +jobTitle+ ", He is working at " +companyName);
        System.out.println("Salary is: " +salary+ " $ " );


    }

}
