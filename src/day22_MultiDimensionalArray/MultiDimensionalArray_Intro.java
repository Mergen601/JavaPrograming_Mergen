package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray_Intro
{
    public static void main(String[] args) {

        String group1 [] =  {"John", "Menna","George"};
        String group2 [] =  {"John", "Menna","John"};
        String group3 [] = {"İhsan","Tuğba","Michale"};
        String group [] [] = new String [3][];
        group [0] = group1;
        group [1] = group2;
        group [2] = group3;
        System.out.println(Arrays.deepToString(group));

        System.out.println("------------------------------------");



    // index of elements  : 0 1 2   0 1 2   0 1 2
        int arr2d [] [] = {{1,2,3},{3,4,6},{5,6,70}};
        // index        :     0       1        2  //

        System.out.println(Arrays.toString(arr2d[1]));
        // ouput : 3,4,6;
        System.out.println(arr2d[2][2]);
        // output : 70;








    }
}

