package edu.bcas.shape.copy;

public class Rectangle {
	

	int area;
	int diameter;
	
	public Rectangle(int width, int height){
		area = width * height;
		diameter =2*(width+height);
	}
	public void findArea() {
		System.out.println("Area of Rectangle" + area);
	}

	public void findDiameter() {
		System.out.println("Diameter of Rectangle" + diameter);
	}

}
