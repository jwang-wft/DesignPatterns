package com.wang.cleancode.switchcase;

public class SalaryEmployee implements Employee {
	SalaryEmployee() {
	}

	public boolean isPayday() {
		// TODO Auto-generated method stub
		return false;
	}

	public Money calculatePay() {
		// TODO Auto-generated method stub
		return new Money(5000);
	}

	public void deliverPay(Money pay) {
		// TODO Auto-generated method stub

	}

}
