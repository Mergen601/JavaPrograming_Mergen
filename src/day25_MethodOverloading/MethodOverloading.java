package day25_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading
{
    public static void main(String[] args) {

      int intArray [] = {12,10,20,80,15,1,100};
      Arrays.sort(intArray);

      double doubArray [] = {12.3,22.4,4.5,1.1,0.1,100.2};
      Arrays.sort(doubArray);

      char charArray [] = {'A','C','E','B','D'};
      Arrays.sort(charArray);

        int result =   sumOfNumbers(6,7,8,8);
        System.out.println(result);


        double result1 = sumOfNumbers(7.2,8.2,3.2);
        System.out.println(result1);

        int result2 = sumOfNumbers(5,6,7,8);
        System.out.println("result2 = " + result2);

        int sum1 = sumOfNumbers(10,20,30);
        System.out.println("sum1 = " + sum1);


    }

    public static int sumOfNumbers (int a,int b)
    {
        return a+b;
    }

    public static int sumOfNumbers (int a, int b, int c)
    {
        return  a+b+c;
    }
    public static int sumOfNumbers (int a, int b, int c, int d)
    {
        return  sumOfNumbers(a, b, c); // it returns sum of three numbers
    }

    public static double sumOfNumbers (double a,double b, double c)
    {
        return  a+b+c;
    }

}
