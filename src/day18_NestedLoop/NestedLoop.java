package day18_NestedLoop;

public class NestedLoop
{
    public static void main(String[] args) {

        for(int i= 1; i<5;i++)
        {
            System.out.println("Wooden Spoon");
        }

        System.out.println("--------------------------");

        for (int j = 0; j < 4; j++) {
            System.out.println("Hello");
            for (int i = 0; i < 4; i++) {

                System.out.println("Wooden spoon" );
            }
            
        }



    }
}
