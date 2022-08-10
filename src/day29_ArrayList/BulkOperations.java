package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations
{
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,5,5,5,6,7,8,8,8,9,9,9,10) );
        System.out.println(list);

        list.removeAll(Arrays.asList(5,8,9));
        System.out.println(list);

        System.out.println("---------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,400,800,900));
        System.out.println(numbers);

        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);

        System.out.println("----------------------");

        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA","SDET","DEVELOPER","QA","SDET","Scrum Master","BA","BA"));
        jobTitles.retainAll(Arrays.asList("QA","SDET"));

        System.out.println(jobTitles);

        System.out.println("-----------------------");

        ArrayList<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        boolean r1 = number.contains(10);
        boolean r2 = number.containsAll(Arrays.asList(10,11,9));

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("-------------------------");
        String names [] = {"James","Beyza","İhsan","Bilgehan","Sıla","Fatma"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);

        System.out.println("------------------------");

         int  arr [] =  {1,2,3,4,5,6,7,8,9,0};
         ArrayList<Integer> convertedArray = new ArrayList<>(convertArrayToArrayList(arr));
        System.out.println(convertedArray);
    }

    public static ArrayList<Integer> convertArrayToArrayList (int arr [])
    {
        ArrayList<Integer> result = new ArrayList<>();

        for(int each : arr)
        {
            result.add(each);
        }

        return result;


    }
}
