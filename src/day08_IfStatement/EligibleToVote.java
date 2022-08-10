package day08_IfStatement;

public class EligibleToVote
{
    public static void main(String[] args)
    {
        String name = "Josh",
               citizen = "USA";

        int age = 22;
        boolean isEligibleToVote = age>=18 && citizen == "USA",
                isNotEligible = !isEligibleToVote;

        if (isEligibleToVote)
        {
            System.out.println(name+" is eligible to vote.");
        }
        if (isNotEligible)
        {
            System.out.println(name+ " is not eligible to vote.");
        }






    }
}
