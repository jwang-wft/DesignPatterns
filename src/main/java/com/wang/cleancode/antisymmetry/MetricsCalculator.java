package com.wang.cleancode.antisymmetry;

public class MetricsCalculator {
	// enable assertions by adding -ea or -enableassertions in jre start arguments
	public double xProjection(Point p1, Point p2) {
		assert p1 != null : "p1 should not be null";
		assert p2 != null : "p2 should not be null";
		return (p2.x - p1.x) * 1.5;
	}

	public static void main(String[] args) {
		MetricsCalculator calculator = new MetricsCalculator();
		Point p2 = new Point(3, 5);
		Point p1 = new Point(1, 1);
		double result = calculator.xProjection(p1, p2);
		System.out.printf("result = %f\n", result);
		calculator.xProjection(null, p2);
	}
}
