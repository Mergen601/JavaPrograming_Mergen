package day17_While_DoWhile;

public class LoopPractice {
    public static void main(String[] args) {


        for (int i=1; i<=10;i++)
        {
            System.out.println(i);
        }


        System.out.println("------------------------");

        int i =1;
        while (i<=10)
        {
            System.out.println(i);
            i++;
        }

        System.out.println("--------------------------");
        int a =1;
        do {

            System.out.println(a);
            a++;
        } while(a<=10);


    }
}
