package co.inventorsoft.oop.task.shapes;

// TODO: 1/10/2018 This class need to define height and width and expose method to calculate the area
public class Rectangle implements Shape{

	private double length;

	private double width;

	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}

	public double area(){
		return length * width;
	}

}
