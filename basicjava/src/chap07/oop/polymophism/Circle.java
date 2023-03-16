package chap07.oop.polymophism;

public class Circle extends Shape {
	private double radius;

	public Circle(){
		
	}
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	
	public void calculationArea() {
		setArea(radius*radius*Math.PI);
	}
	
	public void print() {
		System.out.println(getName() + "의 면적은 " + getArea());
	}
}
