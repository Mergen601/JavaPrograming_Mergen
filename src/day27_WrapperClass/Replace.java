package day27_WrapperClass;

import Utilities.ArrayUtilities;

import java.util.Arrays;

public class Replace
{
    public static void main(String[] args) {


        int array[] = {1, 2, 3, 4, 5, 7, 7};
        int arrayReplaced [] = ArrayUtilities.replaceElement(array,5,6);
        System.out.println(Arrays.toString(arrayReplaced));

    }



}
