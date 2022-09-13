package day38_Inheritance.CarTask;

public class Tesla extends Car{

    public Tesla( String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" has auto pilot");
    }
}
