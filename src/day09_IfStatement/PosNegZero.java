package day09_IfStatement;

public class PosNegZero
{
    public static void main(String[] args)
    {
        int num1 = 0;
        boolean positive = num1 > 0;
        boolean negative = num1 < 0;

        if(positive)
        {
            System.out.println(num1+ " is positive.");
        }

        else if (negative)
        {
            System.out.println(num1 + " is negative.");
        }

        else
        {
            System.out.println(num1+ " is zero.");
        }

    }
}
