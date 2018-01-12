package co.inventorsoft.oop.task.shapes;

import co.inventorsoft.oop.task.area.Shape;

// TODO: 1/10/2018 This class need to define length and expose method to calculate the area
public class Square implements Shape{

    private int a;

    public Square (int a) {
        this.a = a;

        if (a <= 0) {
            System.out.println("Please enter a positive value!");
            System.exit(3);
        }
    }


    @Override
    public double calculateArea() {
        return a*a;
    }
}
