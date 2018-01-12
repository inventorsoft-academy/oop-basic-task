package co.inventorsoft.oop.task.shapes;

// TODO: 1/10/2018 This class need to define length and expose method to calculate the area
public class Square implements CalculateAreaFigure {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return Math.pow(this.length, 2);
    }
}
