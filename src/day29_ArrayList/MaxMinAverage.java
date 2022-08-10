package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinAverage
{
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,21,20,56,1,0));

        int max = numbers.get(0);
        int min = numbers.get(0);
        int sum = 0;


        for(int each : numbers)
        {
            if(each>max)
            {
                max = each;
            }
            if(each<min)
            {
                min = each;
            }

            sum += each;

        }

        double average = sum/numbers.size();

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);



    }
}
