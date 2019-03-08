package com.wang.cleancode.switchcase;

public interface EmployeeFactory {
	public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
	public Employee makeEmployeeByClassName(String classpass) throws InvalidEmployeeType;
}
