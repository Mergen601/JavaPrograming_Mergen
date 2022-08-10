package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(123);
        numbers.add(1234);
        numbers.remove(0);
        System.out.println(numbers.get(0));
    }
}
