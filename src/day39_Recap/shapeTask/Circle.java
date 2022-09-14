package day39_Recap.shapeTask;

public class Circle extends Shape {

    private double radius;
    static double pi = 3.14;

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("Invalid Radius: "+radius);
            System.exit(1);
        }
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double parameters() {
        return 2 * radius * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area ="+area()+
                ", parameteres="+parameters()+
                '}';
    }
}
