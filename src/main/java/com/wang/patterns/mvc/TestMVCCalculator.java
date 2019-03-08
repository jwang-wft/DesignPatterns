package com.wang.patterns.mvc;

public class TestMVCCalculator {

	public static void main(String[] args) {

		CalculatorView theView = new CalculatorView();

		CalculatorModel theModel = new CalculatorModel();

		new CalculatorController(theView, theModel);

		theView.setVisible(true);

	}
}