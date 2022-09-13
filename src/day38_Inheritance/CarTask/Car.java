package day38_Inheritance.CarTask;

public class Car {
    public String brand;
    public String model;
    public int year;
    public double price;
    public String color;


    public Car(String brand, String model, int year, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public void start(){
        System.out.println(brand+" "+model+" is starting.");
    }
    public void drive(){
        System.out.println(brand+" "+model+" is driving");
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
