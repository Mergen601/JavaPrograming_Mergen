package day10_NestedIfStatement;

public class TernariesIntro
{
    public static void main(String[] args)
    {
        int num  = 20;
        String result = (num%2 == 0)? "Even" : "Odd";
        System.out.println("result = " + result);

        System.out.println("----------------------");

        int age = 21;
        String result1 = (age>=18)? "Eligble" : "Not Eligible";
        System.out.println("result1 = " + result1);
        System.out.println((age>=18)? "Eligble" : "Not Eligible");

        System.out.println("-----------------------------------");
        int number = 0;
        String result3 = (number>0)? "Positive" :(number<0)? "Negative" :"ZERO";
        System.out.println(result3);

    }
}
