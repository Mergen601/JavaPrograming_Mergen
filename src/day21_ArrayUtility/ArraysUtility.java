package day21_ArrayUtility;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int nums [] = {10,100,200,30,40};
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);

        System.out.println("----------------------");

        int scores [] =  {10,70,50,40,90,100};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min Scores: " +scores[0]);
        System.out.println("Max Scores: "+scores[scores.length-1]);

        System.out.println("-------------------------------");

        String str [] = {"Maria","John", "Adam","Bill","Zelensky"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        String name [] = {"anna","Anna"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));

        System.out.println("------------------------------------");

        int arr1 [] = {1,2,3};
        int arr2 [] = {2,1,3};
        boolean r1 =   Arrays.equals(arr1,arr2);
        System.out.println(r1);

        System.out.println("------------------------------------");

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("---------------------------------------");

        char ch1 [] = {'A','B','C','D'};
        char ch2 [] = {'B','D','C','A'};
        boolean istrue = Arrays.equals(ch1,ch2);
        System.out.println(istrue);

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean istrue2 = Arrays.equals(ch1,ch2);
        System.out.println(istrue2);






    }


}
