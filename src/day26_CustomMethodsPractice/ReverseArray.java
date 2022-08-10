package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray
{
    public static void main(String[] args) {
        int  arr1 [] = {1,2,3,4,5};
         int result []= ReverseArray(arr1);
        System.out.println(Arrays.toString(result));
    }
    public static int [] ReverseArray (int arr[])
    {
        int result [] = new int[arr.length];
        int i =0;

        for (int j = arr.length - 1; j >= 0; j--)
        {
            result [i] = arr[j];
            i++;
        }

        return result;
    }
}
