package day21_ArrayUtility;

import java.util.Arrays;

public class AverageOfArrays
{

    public static void main(String[] args) {

        int [] scores = {100,80,60,70,30,20};
        int sum = 0;

        for(int each :scores)
        {
            sum += each;
        }

        double average = sum/ scores.length;
        System.out.println("average = " + average);






    }




}
