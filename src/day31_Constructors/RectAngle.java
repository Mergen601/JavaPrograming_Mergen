package day31_Constructors;

public class RectAngle {
    public double length, width;

    public RectAngle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea()
    {
         return length * width;
    }

    public double calPerimeter()
    {
       return 2* (length+width);

    }

    public String toString() {
        return "RectAngle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea() +
                ", perimeter=" + calPerimeter() +
                '}';
    }
}
