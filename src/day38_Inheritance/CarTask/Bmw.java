package day38_Inheritance.CarTask;

public class Bmw extends Car{
    public Bmw( String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    public void breakdown(){
        System.out.println(brand+" "+model+" is breakdown");
    }

    public void racing(){
        System.out.println(brand+" "+model+" is racing car");
    }
}
