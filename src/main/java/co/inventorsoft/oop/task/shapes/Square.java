package co.inventorsoft.oop.task.shapes;

// TODO: 1/10/2018 This class need to define length and expose method to calculate the area
public class Square implements Shape{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
