package day09_IfStatement;

public class NameOfDays
{
    public static void main(String[] args)
    {
        int n = 3;
        String day = null;

        if(n==1)
        {
            System.out.println("Monday");
        } else if (n==2)
        {
            day = "Tuesday";
        } else if (n==3)
        {
            day = "Wednesday";
        } else if (n==4)
        {
            day="Thursday";
        } else if (n==5)
        {
            day="Friday";
        } else if (n==6)
        {
             day = "Saturday";
        } else if (n==7)
        {
            day = "Sunday";
        }

        else
        {
            System.err.println("INVALID");
        }
        System.out.println(day);




    }
}