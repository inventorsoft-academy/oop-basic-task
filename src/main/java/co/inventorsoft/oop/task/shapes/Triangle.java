package co.inventorsoft.oop.task.shapes;

// TODO: 1/10/2018 This class need to define base and height and expose method to calculate the area
public class Triangle implements CalculateAreaFigure {
    private double height, base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return (this.height *this.base)/2;
    }
}
