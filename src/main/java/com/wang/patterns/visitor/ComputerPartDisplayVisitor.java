package com.wang.patterns.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	public void visit(Computer computer) {
		System.out.println("displaying Computer.");
	}

	public void visit(Mouse mouse) {
		System.out.println("displaying Mouse.");
	}

	public void visit(Keyboard keyboard) {
		System.out.println("displaying Keyboard.");
	}

	public void visit(Monitor monitor) {
		System.out.println("displaying Monitor.");
	}

}
