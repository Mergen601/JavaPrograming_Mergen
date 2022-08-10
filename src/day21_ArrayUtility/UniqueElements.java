package day21_ArrayUtility;

public class UniqueElements {
    public static void main(String[] args) {


        String [] str = {"Java","Java","Python","Mobile","Python","Java"};
        String str1 = str [0];

        for (String each: str)
        {
            int count = 0;

            for (String element: str)
            {
                if(element.equals(each))
                {
                    count++;
                }

            }

            if(count==1)
            {
                System.out.println(each);
            }
        }



    }

}
