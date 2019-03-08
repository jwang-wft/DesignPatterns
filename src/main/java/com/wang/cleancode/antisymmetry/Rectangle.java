package com.wang.cleancode.antisymmetry;

public class Rectangle {
	public Point topLeft;
	public double height;
	public double width;
	
	Rectangle(Point topLeft, double height, double width){
		this.topLeft = topLeft;
		this.height = height;
		this.width = width;
	}
	
	double area(){
		return height * width;
	}
}
