package co.inventorsoft.oop.task.shapes;

import main.java.co.inventorsoft.oop.task.shapes.MegaShape;

// TODO: 1/10/2018 This class need to define height and width and expose method to calculate the area
public class Rectangle implements MegaShape {
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double area() {
        return height*width;
    }
}
