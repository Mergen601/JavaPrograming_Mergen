package day09_IfStatement;

public class MaximumNumber
{
    public static void main(String[] args)
    {
        int a = 30, b =20;
        boolean isMaxNumber = a>b;
        boolean isMinNumber = a<b;

        if(isMaxNumber)
        {
            System.out.println(a+ " is maximum number.");
        }
        else
        {
            System.out.println(b+ " is maximum number.");
        }
        if (isMinNumber)
        {
            System.out.println(a + " is minimum number.");
        }
        else
        {
            System.out.println(b+ " is minimum number.");
        }

        System.out.println("---------------------------------");
        int num1 = 30, number2= 45;
        String result = (num1>number2)? num1+"is maximum" :(number2>num1)? number2+" is maximum" : "equal";
        System.out.println(result);


    }
}
