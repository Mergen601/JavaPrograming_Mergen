package day27_WrapperClass;

import Utilities.ArrayUtilities;

import java.util.Arrays;

public class ReplaceAll
{
    public static void main(String[] args) {

        int arr [] = {1,1,2,3,4,5,6,1};
        int result [] = ArrayUtilities.replaceAll(arr,1,0);
        System.out.println(Arrays.toString(result));
    }




}
