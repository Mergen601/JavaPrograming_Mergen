package day17_While_DoWhile;

public class BranchingStatement2
{
    public static void main(String[] args) {

        for(char  i ='A'; i<='Z';i++)
        {
            if(i=='C') {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("------------------------------------");


        for(int i =0; i<=10; i++)
        {
            if(i%2 !=0)
            {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("---------------------");
        for(int k =0; k<=10; k++)
        {
            if(k%2==0)
            {
                continue;
            }
            System.out.println(k);
        }
    }

}
