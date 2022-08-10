package day27_WrapperClass;

import Utilities.ArrayUtilities;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int arr [] = {1,1,2,2,3,4,5,6,7,7};
        arr = ArrayUtilities.removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

    }

}
