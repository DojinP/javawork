package chap07.oop.polymophism;

public abstract class Shape {
	protected Double area;
	private String name;
	
	public Shape() {
		
	}
	
	public Shape(String name) {
		this.name = name;
	}
	
	public abstract void calculationArea();
	
	public void print() {
		
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
