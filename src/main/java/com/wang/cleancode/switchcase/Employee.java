package com.wang.cleancode.switchcase;

public interface Employee {
	public boolean isPayday();
	public Money calculatePay();
	public void deliverPay(Money pay);
}
