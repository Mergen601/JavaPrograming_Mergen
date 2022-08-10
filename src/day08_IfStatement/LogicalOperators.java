package day08_IfStatement;

public class LogicalOperators
{
    public static void main(String[] args)
    {
        String name = "İhsan";
        int age = 19;
        String citizen = "TURKEY";

        Boolean isEligible = age >=18  && citizen== "TURKEY";


        System.out.println(name+ " is eligible to vote: "+isEligible);
        System.out.println("\n");

        System.out.println("---------------------------------------------");
        String name2 = "John";

        int creditScore = 720;
        int age2 = 23;
        int income = 15000;

        boolean isEligible2 = creditScore>=700 && age2>=23 && income>=10000;
        System.out.println(name2+ " is eligible for loan: "+isEligible2);

        System.out.println("---------------------------------------------");
        String name3 = "Beyza";
        char gender = 'F';
        int age3 = 24;

        boolean isEligible3 = age3>= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name3+ " is eligible to register: "+isEligible3);

        System.out.println("---------------------------------------------");
        String name4 = "James",
               countryOfBirth = "UK";

        Boolean isMarriedToUsCitizen = false;
        boolean isEligible4 = countryOfBirth =="USA" || isMarriedToUsCitizen ==true;
        System.out.println(name4+ " is eligible to apply Us citizenship: "+isEligible4);

        System.out.println("-----------------------------------------------");

        int score = 60;
        boolean passed = score>=70;
        boolean failed = !passed;
        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);













    }
}
