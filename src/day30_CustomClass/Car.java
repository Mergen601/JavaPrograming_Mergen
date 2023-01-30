package day30_CustomClass;

public class Car
{
    public String brand;
    public String model;
    public int year;
    public String color;
    public double price;

    public void setInfo(String carBrend, String carModel,int carYear ,String carColor,double carPrice)
    {
        brand = carBrend;
        model = carModel;
        year = carYear;
        color = carColor;
        price = carPrice;
    }

    public void Information()
    {
        System.out.println("This car brand is: "+brand);
        System.out.println("This car model is: "+model);
        System.out.println("This car color is: "+color);
        System.out.println("This car price is: "+price+ "$");
    }

    public void  drive ()
    {
        System.out.println("Driving "+brand+ " "+model);
    }

    public void  stop()
    {
        System.out.println(brand + " "+model+ " has stopped");
    }

    public void  start()
    {
        System.out.println(brand+ " " +model+ " has started");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

}
