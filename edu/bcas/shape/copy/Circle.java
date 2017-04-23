package edu.bcas.shape.copy;

public class Circle {
	
	
	float area;
	float diameter;
	public Circle(float radious){
		area = radious*radious*22/7;
		diameter= 2*radious*22/7;
	}
	public void findArea() {
		System.out.println("Area of Circle "+area);
	}

	public void findDiameter() {
		System.out.println("Diameter of Circle "+diameter);
	}

}
