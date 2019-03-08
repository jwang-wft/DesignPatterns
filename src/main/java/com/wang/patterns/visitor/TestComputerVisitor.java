package com.wang.patterns.visitor;

public class TestComputerVisitor {
	public static void main(String[] args){
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
