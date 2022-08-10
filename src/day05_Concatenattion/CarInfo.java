package day05_Concatenattion;

public class CarInfo
{
    public static void main(String[] args)
    {
        String  year = "2015",
                make = "Toyota",
                model = "Camry",
                miles = "5000 miles",
                color = "red",
                price = "5000$";
        String car =year + " " +make+ " " +model+ ", " +miles+ ", "  +color+ ", " +price+ ". ";
        System.out.println(car);




    }
}
