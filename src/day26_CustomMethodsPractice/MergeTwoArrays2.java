package day26_CustomMethodsPractice;
import Utilities.ArrayUtilities;

import java.util.Arrays;

public class MergeTwoArrays2 {

    public static void main(String[] args) {
        int arr1 [] = {12,3123,22,2,1};
        int arr2 [] = {21,21,2,2,4,5,7};
        System.out.println(Arrays.toString(ArrayUtilities.mergeArrays(arr1,arr2)));

        System.out.println("-------------------------------------------------");

        String array1 [] = {"A","B","12","C"};
        String array2 [] = {"c","ds","s,","d"};
        System.out.println(Arrays.toString(ArrayUtilities.mergeArrays(array1,array2)));



    }

}
