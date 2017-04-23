package edu.bcas.shape;

public class ShapeMain {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.findArea();
		circle.findDiameter();

		Square sq = new Square();
		sq.findArea();
		sq.findDiameter();

		Rectangle rct = new Rectangle();
		rct.findArea();
		rct.findDiameter();
	}

}
