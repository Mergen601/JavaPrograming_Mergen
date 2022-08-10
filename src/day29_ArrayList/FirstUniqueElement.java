package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement
{
    public static void main(String[] args) {

        ArrayList<Integer> numberList  = new ArrayList<>();
        numberList.addAll(Arrays.asList(1,1,2,2,3,3,4,5,5));



        for (int each :numberList) {
            int frequency = 0;

            for (int element : numberList) {
                if (element == each){
                    frequency++;
                }
            }

            if(frequency==1) {
                System.out.println(each);
                break;
            }

        }



    }
}
