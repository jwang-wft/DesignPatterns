package com.wang.cleancode.switchcase;

public class EmployeeFactoryImpl implements EmployeeFactory {
	final int COMMISSIONED = 0;
	final int HOURLY = 1;
	final int SALARIED = 2;

	// it is a better implementation, but if we need add a new Employee Type, we
	// still need
	// 1. create a new class for the new Employee Type
	// 2. modify this function to add new type.
	public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
		switch (r.type) {
		case COMMISSIONED:
			return new CommissionedEmployee();
		case HOURLY:
			return new HourlyEmployee();
		case SALARIED:
			return new SalaryEmployee();
		default:
			throw new InvalidEmployeeType(r.type);
		}
	}
	// this function will never be needed to make any modification when we add new type of Employee.
	public Employee makeEmployeeByClassName(String className) throws InvalidEmployeeType {
		Employee employee = null;
		try {
			Class<?> c = Class.forName(className);
			employee = (Employee) c.newInstance();
		} catch (Exception e) {
			throw new InvalidEmployeeType(className);
		}
		return employee;
	}
}
