package day15_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i = 15; i <= 45; i++) {
            System.out.println(i + " ");
        }
        System.out.println();

        System.out.println("******************************");
        for (int i = 100; i >= 95; i--) {
            System.out.println(i + " ");
        }

        System.out.println("****************************");

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }

    }
}
