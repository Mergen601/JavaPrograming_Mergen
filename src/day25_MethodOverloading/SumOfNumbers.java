package day25_MethodOverloading;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumOfNumbers
{
    public static void main(String[] args) {

        int sum = sumOfNumbers(10,5);
        System.out.println("sum = " + sum);

        System.out.println("----------------------------------");

        int sum2 = sumOf3Numbers(4,5,2);
        System.out.println("sum2 = " + sum2);

        System.out.println("------------------------------------");

        int sum3 = sumOf4Numbers(5,8,7,10);
        System.out.println("sum3 = " + sum3);

         
    }


    public static int sumOfNumbers (int a,int b)
    {
         return a+b;
    }

    public static int sumOf3Numbers (int a, int b, int c)
    {
        return  a+b+c;
    }
    public static int sumOf4Numbers (int a, int b, int c, int d)
    {
        return  a+b+c+d;
    }



}
