package chpater9c;

public class Rectangle {

	double length;
	double width;
	double sides = 4;
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getSides() {
		return sides;
	}
	public void setSides(double sides) {
		this.sides = sides;
	}
	public void print() {
		System.out.println("I am a rectangle");
	
	}
	public double calculatePerimeter() {
		return (2*length) + (2*width);
	}
	
}
