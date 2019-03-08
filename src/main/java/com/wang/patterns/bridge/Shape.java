package com.wang.patterns.bridge;

public abstract class Shape {
	protected DrawingAPI drawingApi;
	protected Shape(final DrawingAPI drawApi){
		this.drawingApi = drawApi;	
	}
    public abstract void draw();                                 // low-level
    public abstract void resizeByPercentage(final double pct);   // high-level
}
