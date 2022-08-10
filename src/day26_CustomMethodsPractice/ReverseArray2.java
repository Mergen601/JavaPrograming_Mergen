package day26_CustomMethodsPractice;

import Utilities.ArrayUtilities;

public class ReverseArray2
{
    public static int [] reverse (int arr [])
    {
        int result [] = {};

        for (int i = arr.length - 1; i >= 0; i--) {

            result = ArrayUtilities.addElement(result,arr[i]);
        }

        return result;
    }

}
