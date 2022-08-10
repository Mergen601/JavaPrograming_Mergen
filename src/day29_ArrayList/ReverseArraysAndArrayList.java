package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArraysAndArrayList
{
    public static void main(String[] args) {


        int arr [] = {1,2,3,4,5,6,7,8,9};

        int result [] = new int[arr.length];


        for (int i = arr.length - 1,j=0; i >= 0; i--,j++)
        {
            result [j] = arr[i];

        }

        System.out.println(Arrays.toString(result));

        System.out.println("-----------------------------------------");


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> reversedList = new ArrayList<>();
        reversedList.addAll(list);
        Collections.reverse(reversedList);

        System.out.println("list = " + list);
        System.out.println("reversedList = " + reversedList);






    }
}
