package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        //Store ten elements : 10, 20 , 30, 40;

        int number [] = {10,20,30,30,40,50,60,70,80,90,100,110};

        System.out.println(Arrays.toString(number));

        System.out.println("----------------------------------");

        int scores [] =  new int[5];

        scores [0] = 45;
        scores [scores.length-1] = 65;
        scores [2] = 40;
        scores [3] = 55;
        scores [1] = 70;


        System.out.println(Arrays.toString(scores));

        System.out.println("------------------------------------");

        String month[] = {"January","February","March","April","May","June","July","August","September",
        "October","November","December"};

        for(int i=0; i< month.length; i++)
        {
            System.out.println(month[i]);
        }

        System.out.println("-----------------------");
        for (int j = month.length-1; j >=0 ; j--)
        {
            System.out.println(month[j]);
        }









    }
}
