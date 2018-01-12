package co.inventorsoft.oop.task.shapes;

// TODO: 1/10/2018 This class need to define height and width and expose method to calculate the area
public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
