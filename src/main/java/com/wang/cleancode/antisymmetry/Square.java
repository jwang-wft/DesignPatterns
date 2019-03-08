package com.wang.cleancode.antisymmetry;

public class Square implements Shape {
	private Point topLeft;
	private double side;
	
	public Square(Point topLeft, double side){
		this.topLeft = topLeft;
		this.side = side;
	}

	public double area() {
		return side * side;
	}

	public double perimeter() {
		return side * 4.0;
	}

	public Point getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	
}
