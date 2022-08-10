package day26_CustomMethodsPractice;

import java.util.Arrays;

public class MergeTwoArrays
{
    public static void main(String[] args) {

        int  arr1 [] = {1,23,13,213,12,3123,1,3};
        int  arr2 [] = {12,12312,3,3,2,2,2,1,0,1};
        System.out.println(Arrays.toString(merge(arr1,arr2)));


    }

    public static int [] merge (int [] arr1, int arr2[])
    {
        int result [] = new int[arr1.length+arr2.length];
        int i=0;

        for (int each : arr1)
        {
            result [i] = each;
            i++;
        }

        for(int each :arr2)
        {
            result[i] = each;
            i++;
        }

        return  result;
    }
}
