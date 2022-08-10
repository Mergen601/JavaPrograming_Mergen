package day23_CustomMethods;

import java.util.Scanner;

public class CustomMethodWithParameters {
    // create a function can check if a number is odd or even number

    public static void main(String[] args)
    {
        OddOrEven(5);
        ageOfPerson(2000);
        beetweenXandY(100,104);




    }

    public static void OddOrEven (int number){

        if(number%2==0)
        {
            System.out.println(number+" is even number");
        }
        else
        {
            System.out.println(number+ " is odd number");
        }

    }

    public static void ageOfPerson(int birthYear) {
         int age = 2022- birthYear;
        System.out.println("Your age is "+age);
    }

    public static  void beetweenXandY(int x , int y) {
        for(int i=x; i<=y;i++)
        {
            System.out.println(i);
        }
    }
}
