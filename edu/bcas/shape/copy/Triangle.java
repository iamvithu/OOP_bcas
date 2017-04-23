package edu.bcas.shape.copy;

public class Triangle {
 
	int area;
	int diameter;
	public Triangle(int base, int height){
		area = 1/2*base*height;
		diameter = 3*base;
		
	}
	public void findArea() {
		System.out.println("Area of Triangle" + area);
	}

	public void findDiameter() {
		System.out.println("Diameter of Triangle" +diameter);
	}

}

