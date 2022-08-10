package day09_IfStatement;

public class LeapYear
{
    public static void main(String[] args)
    {
        int year = 2000;
        boolean leapyYear = year%4 ==0;

        if(leapyYear)
        {
            System.out.println(year+ " is leap year.");
        }
        else
        {
            System.out.println(year+ " isn't leap year");
        }


    }
}
