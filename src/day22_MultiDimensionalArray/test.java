package day22_MultiDimensionalArray;

public class test
{
    public static void main(String[] args) {

      String s = "the game was tied at 2-2";
      String s2 = s.substring(5);
      int a1 = s.indexOf("game");
      int a2 = s2.indexOf("game");
      if(a1==a2)
          System.out.println(a1);
      else
          System.out.println(a2);

      int number = 5;
      while ((number<100))
      {
          number += number;
      }
        System.out.println(number);



        int nums = 5;
        int   b=--nums;
        System.out.println("b = " + b);
        


    }
}
