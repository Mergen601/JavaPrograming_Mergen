package day20_Arrays;

import java.util.Arrays;

public class MaxNumberOfArray
{
    public static void main(String[] args) {

        int number [] = {10,0,20,100,40};
        int max = number[0];


        for (int i = number.length - 1; i >= 0; i--) {

            if(number[i]>max)
                max=number[i];

            
        }

        System.out.println(max);







    }


}
