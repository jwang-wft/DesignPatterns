package com.wang.patterns.bridge;

public class TestBridgePattern {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[]{new CircleShape(1, 2, 3, new DrawingCircle1()), new CircleShape(5, 7, 11, new DrawingCircle2())};

		for (Shape shape : shapes) {
			shape.resizeByPercentage(2.5);
			shape.draw();
		}
	}

}
