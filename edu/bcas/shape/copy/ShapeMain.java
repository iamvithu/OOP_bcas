package edu.bcas.shape.copy;

import java.util.Scanner;

public class ShapeMain {
	public static void main(String[] args) {
		int choiceNo;
		do{
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1 : Circle\n2 : Rectangle\n3 : Triangle\n4 : Square\n ");
		System.out.println("Enter choice for shape :");
		choiceNo = scan.nextInt();

		if (choiceNo == 1) {
			System.out.println("Enter the radious for circle :");
			int r = scan.nextInt();
			Circle circle = new Circle(r);
			circle.findArea();
			circle.findDiameter();

		} else if (choiceNo == 2) {
			System.out.println("Enter the width for Rectangle");
			int width=scan.nextInt();
			System.out.println("Enter the height for Rectangle");
			int height=scan.nextInt();
			Rectangle rectangle = new Rectangle(width,height);
			rectangle.findArea();
			rectangle.findDiameter();
			
			
		} else if (choiceNo == 3) {
			System.out.println("Enter the base for Triangle");
			int base=scan.nextInt();
			System.out.println("Enter the height for Triangle");
			int height=scan.nextInt();
			Triangle triangle = new Triangle(base, height);
			triangle.findArea();
			triangle.findDiameter();
			
		} else if (choiceNo == 4) {
			System.out.println("Enter the lenth for Square");
			int lenth=scan.nextInt();
			Square square = new Square(lenth);
			square.findArea();
			square.findDiameter();
		}
		}
		while(choiceNo<=5);
		
	}
}
		/*
		Circle circle = new Circle(4);
		circle.findArea();
		circle.findDiameter();

		Square sq = new Square(5);
		sq.findArea();
		sq.findDiameter();

		Rectangle rct = new Rectangle(4, 8);
		rct.findArea();
		rct.findDiameter();
		
		Triangle tri = new Triangle(3, 6);
		tri.findArea();
		tri.findDiameter();
		}
		}
*/

