package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator
{
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100,22,68,74,85,99,34,69,40,55,93,96,83,82));
        System.out.println("scores = " + scores);

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores);
        gradeOfA.removeIf(p -> (p<90));
        System.out.println("gradeOfA = " + gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores);
        gradeOfB.removeIf(p -> !(p>=80 && p<=89));
        System.out.println("gradeOfB = " + gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores);
        gradeOfC.removeIf(p -> !(p>=70 && p<=79));
        System.out.println("gradeOfC = " + gradeOfC);


        ArrayList<Integer> gradeOfD = new ArrayList<>(scores);
        gradeOfD.removeIf(p -> !(p>=60 && p<=69));
        System.out.println("gradeOfD = " + gradeOfD);


        ArrayList<Integer> gradeOfF = new ArrayList<>(scores);
        gradeOfF.removeIf(p -> !(p>=0 && p<=59));
        System.out.println("gradeOfF = " + gradeOfF);

    }
}
