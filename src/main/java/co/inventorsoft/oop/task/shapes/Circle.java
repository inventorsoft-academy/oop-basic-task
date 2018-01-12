package co.inventorsoft.oop.task.shapes;

// TODO: 1/10/2018 This class need to define radius and expose method to calculate the area
public class Circle implements Shape {
    private double radius;

    public Circle() {
        this.radius = 6.28;
    }


    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
