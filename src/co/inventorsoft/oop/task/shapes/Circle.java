package co.inventorsoft.oop.task.shapes;

// TODO: 1/10/2018 This class need to define radius and expose method to calculate the area
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
       return  Math.PI * (radius * radius);
    }
}
