package day04_Variables;

public class SalaryCalculator
{
    public static void main(String[] args)
    {
        //hourlyrate, weeklyHourls

        int hourlyRate = 65;
        int weeklyHours = 45;
        int numberOfWeeks = 52;
        int salary;

        salary = hourlyRate*weeklyHours*numberOfWeeks; //salary calculate formula//


        System.out.println("salary = $" + salary);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = $" + hourlyRate);

    }
}
