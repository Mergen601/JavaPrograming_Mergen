package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultidimensionalArray
{
    public static void main(String[] args) {

        int arr2d [] [] = {{1,2,3},{4,5,6,7},{7,8,9,10,11}};


        for(int i=0; i< arr2d.length;i++) // Index numbers of single dimensional array
        {

            System.out.println(Arrays.toString(arr2d[i]));

            for (int i1 = 0; i1 < arr2d[i].length; i1++)
            {
                System.out.print(arr2d[i][i1]+" ");

            }

            System.out.println();

        }


    }
}
