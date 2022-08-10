package day28_ArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class ArrayMethod2
{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(123);
        list.add(1);
        list.add(1-1);
        System.out.println(list);

        list.removeAll(list);
        System.out.println(list);

        list.clear();
        System.out.println(list);


        System.out.println("---------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(100);
        numbers1.add(200);
        numbers1.add(300);

        System.out.println(numbers.equals(numbers1));

        System.out.println("-------------------------------------------");

        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.addAll(Arrays.asList(1,2,2,2,3,4,4));
        System.out.println(numbersList);









    }
}
