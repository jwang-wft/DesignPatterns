package com.wang.cleancode.switchcase;

public class BadSwitch {
	 final int COMMISSIONED = 0;
	 final int HOURLY = 1;
	 final int SALARIED = 2;
	 
	public static void main(String[] args) throws Exception{
		BadSwitch bs = new BadSwitch();
		EmployeeBadClass employee = new EmployeeBadClass(0);
		Money money = bs.calculatePay(employee);
		money.print();
		
		employee = new EmployeeBadClass(1);
		money = bs.calculatePay(employee);
		money.print();

		employee = new EmployeeBadClass(2);
		money = bs.calculatePay(employee);
		money.print();
	}
/*
 * Problems:
 * 1. it is large, when new employee types are added, it will grow;
 * 2. it does more than one thing.
 * 3. Violates the Single Responsibility Principle, because there is more than one reason for it to change
 * 4. it violates Open Closed Principle, because it must change whenever new types are added.
 * 5. worst problem, there maybe an unlimited number of other functions  that will have the same structures.
 */
	public Money calculatePay(EmployeeBadClass e) throws InvalidEmployeeType {
		switch (e.type) {
		case COMMISSIONED:
			return calculateCommissionedPay(e);
		case HOURLY:
			return calculateHourlyPay(e);
		case SALARIED:
			return calculateSalariedPay(e);
		default:
			throw new InvalidEmployeeType(e.type);
		}
	}
	
	Money calculateCommissionedPay(EmployeeBadClass e){
		return new Money(5000);
	}
	
	Money calculateHourlyPay(EmployeeBadClass e){
		return new Money(6000);
		
	}
	Money calculateSalariedPay(EmployeeBadClass e){
		return new Money(10000);
	}
}

class InvalidEmployeeType extends Exception{
	private static final long serialVersionUID = 1L;
	public InvalidEmployeeType(int type) {
		super(String.format("the type of %s Employee is not supported.", type));
	}
	public InvalidEmployeeType(String type) {
		super(String.format("the type of %s Employee is not supported.", type));
	}
	
}

class EmployeeBadClass{
	int type;
	EmployeeBadClass(int type){
		this.type = type;
	}
}
class Money {
	float payment;
	Money(float payment){
		this.payment = payment;
	}
	
	void print(){
		System.out.println("The payment will be " + this.payment);
	}
}