package com.wang.patterns.bridge;

public class DrawingCircle1 implements DrawingAPI{

    public void drawCircle(final double x, final double y, final double radius) {
        System.out.printf("API1.circle at %f:%f radius %f%n", x, y, radius);
    }
}
