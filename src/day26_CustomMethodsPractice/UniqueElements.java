package day26_CustomMethodsPractice;

import Utilities.ArrayUtilities;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int arr [] = {1,1,1,2,3,3,3};
        int uniqueElement [] = UniqueElement(arr);
        System.out.println(Arrays.toString(uniqueElement));
        System.out.println("---------------------------");

        String arr1[] = {"Ayşe","MEHMET","Ayşe"};
        String uniqueElements [] = ArrayUtilities.UniqueElement(arr1);
        System.out.println(Arrays.toString(uniqueElements));
    }

    public static int [] UniqueElement (int arr []) {
        int result [] = {};
        for(int each : arr)
        {
            if(ArrayUtilities.frequencyOfElement(arr,each)==1)
            {
              result =  ArrayUtilities.addElement(result,each);

            }


        }

        return result;
    }
}
