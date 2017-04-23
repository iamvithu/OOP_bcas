package edu.bcas.shape.copy;

public class Square {
	
	int area;
	int diameter;
	public Square(int length){
		area = length * length;
		diameter = 4*length;
		
	}
	public void findArea() {
		System.out.println("Area of Square" + area);
	}

	public void findDiameter() {
		System.out.println("Diameter of Square" +diameter);
	}

}
