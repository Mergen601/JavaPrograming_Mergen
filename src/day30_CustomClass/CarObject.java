package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject
{
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Mercede","x5",2015,"Red",55000);

        Car car2 = new Car();
        car2.setInfo("BMW","325İ",2022,"Black",100000);

        Car car3 = new Car();
        car3.setInfo("Hyunda","i20",2018,"White",10000);


        //Car [] cars = {car1,car2,car3};

        ArrayList <Car> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1,car2,car3));
        System.out.println(cars);


        for(Car each : cars)
        {
            System.out.println(each.brand + " : " +each.price);

        }

        System.out.println("----------------------------------------");

        cars.removeIf(p -> p.brand.equals("BMW") && p.year>=2005  && p.year<=2008);
        cars.removeIf(p -> p.brand.equals("Toyoya") && p.year>=1996 && p.year<=2005);

    }
}
