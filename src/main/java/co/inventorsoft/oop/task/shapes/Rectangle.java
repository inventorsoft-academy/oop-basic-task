package co.inventorsoft.oop.task.shapes;

// TODO: 1/10/2018 This class need to define height and width and expose method to calculate the area
public class Rectangle implements CalculateAreaFigure {
    private double height, width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return this.height * this.width;
    }
}
