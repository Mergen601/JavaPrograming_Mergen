package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice
{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        for (int i = 0; i < numbers.size()-1; i++) {

            numbers.set(i, numbers.get(i)*2);


        }
        System.out.println(numbers);

    }
}
