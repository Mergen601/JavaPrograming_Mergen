package day10_NestedIfStatement;

public class DaysInWeek
{
    public static void main(String[] args) {

        int dayNumber = 5;
        String result = (dayNumber==1)? "Monday" :(dayNumber==2)? "Tuesday" :(dayNumber==3)? "Wednesday"
                :(dayNumber == 4)? "Thursday" :(dayNumber==5)? "Friday" :(dayNumber == 6)? "Saturday"
                :(dayNumber == 7)? "Sunday" : "Invalid Number";

        System.out.println(result);
    }
}
