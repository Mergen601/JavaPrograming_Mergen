package day26_CustomMethodsPractice;

import Utilities.ArrayUtilities;

import java.util.Arrays;

public class RemoveElements2
{

    public static void main(String[] args) {

        int arr [] = {10,2,4,5,6,78,9};
        System.out.println(Arrays.toString(removeElement(arr,12)));
    }
    public static int [] removeElement (int arr [],int index) {

        if(index<0 ||index> arr.length-1)
        {
            System.err.println("Invalid index");
            System.exit(0);
        }


        int result[] = {};

        for (int i = 0; i < arr.length - 1; i++) {
            if (i != index)
            {

                result = ArrayUtilities.addElement(result, arr[i]);

            }
        }

        return  result;

    }

}
