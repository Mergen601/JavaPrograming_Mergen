package day26_CustomMethodsPractice;

import java.util.Arrays;



public class RemoveElement {
    public static void main(String[] args)
    {
        int arr [] = {1,2,3,4,5,6,7,9};
        int removeElement [] = removeElement(arr,0);
        System.out.println(Arrays.toString(removeElement));

    }
    public static int[] removeElement(int arr[], int index) {
        if(index<0 ||index> arr.length-1)
        {
            System.err.println("Invalid index");
            System.exit(0);
        }

        int result [] = new int[arr.length-2];
        int j= 0;
        for (int i=0; i< arr.length-1;i++)
        {
            if(i==index)
            {
                continue; // remove
            }

            result [j++] =arr[i];

       }
           return  result;
    }
}





