package day17_While_DoWhile;

public class FrequencyOfWord2
{
    public static void main(String[] args) {


        String str = "Cat Dog Cat Dog Dog asdasdasd Cat DASDAScAT";
        int frequencyOfCat = 0;
        int frequencyOfDog = 0;

        for(int i=0; i<str.length()-2;i++)
        {
            String eachSub = str.substring(i,i+3);

            if(eachSub.equalsIgnoreCase("Cat"))
            {
                frequencyOfCat++;
            }
            else if (eachSub.equalsIgnoreCase("Dog"))
            {
                frequencyOfDog++;
            }
        }
        System.out.println("frequencyOfDog = " + frequencyOfDog);
        System.out.println("frequencyOfCat = " + frequencyOfCat);
    }
}
