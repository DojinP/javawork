package chap07.oop.polymophism;

public class Rectangular extends Shape {
	private double width;
	private double height;
	
	public Rectangular() {

	}
	
	public Rectangular(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	public void calculationArea() {
		setArea(width * height);
	}
	
	public void print() {
		System.out.println(getName() + "의 면적은 " + getArea());
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
