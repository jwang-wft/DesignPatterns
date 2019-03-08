package com.wang.cleancode.antisymmetry;

public class TestGeometry {

	public static void main(String[] args) throws Exception {
		Point p = new Point(1.0, 1.0);
		Square square = new Square(p, 5.0);
		Geometry g = new Geometry();
		double area = g.area(square);
		System.out.printf("the area of square with side %f is %f.\n", square.getSide(), area);
		double perimeter = g.perimeter(square);
		System.out.printf("the perimeter of square with side %f is %f.\n", square.getSide(), perimeter);
	}
}
