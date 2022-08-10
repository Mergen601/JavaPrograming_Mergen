package day08_IfStatement;

public class SingleIfStatementIntro
{
    public static void main(String[] args)
    {
        int number = 301;
        boolean evenNumber = number%2==0;
        boolean oddNumber = !evenNumber;

        if(evenNumber)
        {
            System.out.println(number +" is even number");

        }
        if (oddNumber)
        {
            System.out.println(number + " is odd number");
        }

        System.out.println("----------------------------------");

        int number2 =100;

        boolean isPositiveNumber = number2>0,
                isNegativeNumber = number2<0,
                isEqualToZero = number2 == 0;


        if(isPositiveNumber)
        {
            System.out.println(number2 +" is positive number.");
        }
        if(isNegativeNumber)
        {
            System.out.println(number2+ " is negative number.");
        }
        if (isEqualToZero)
        {
            System.out.println(number2+ " is equal to zero.");
        }





    }
}
