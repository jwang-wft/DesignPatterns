package com.wang.cleancode.switchcase;

public class CommissionedEmployee implements Employee {
	public CommissionedEmployee() {
	}

	public boolean isPayday() {
		// TODO Auto-generated method stub
		return false;
	}

	public Money calculatePay() {
		// TODO Auto-generated method stub
		return new Money(10000);
	}

	public void deliverPay(Money pay) {
		// TODO Auto-generated method stub

	}

}
