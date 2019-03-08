package com.wang.cleancode.switchcase;

public class HourlyEmployee implements Employee {
	HourlyEmployee() {
	}

	public boolean isPayday() {
		// TODO Auto-generated method stub
		return false;
	}

	public Money calculatePay() {
		// TODO Auto-generated method stub
		return new Money(6000);
	}

	public void deliverPay(Money pay) {
		// TODO Auto-generated method stub

	}

}
