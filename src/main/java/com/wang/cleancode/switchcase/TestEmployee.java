package com.wang.cleancode.switchcase;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestEmployee {
	Employee employee;
	EmployeeRecord record;
	EmployeeFactory factory;

	@Before
	public void setUp() throws Exception {
		factory = new EmployeeFactoryImpl();
		record = new EmployeeRecord();
	}

	@Test
	public void testCommissionedEmployee() {
		record.type = 0;
		try {
			employee = factory.makeEmployee(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Money money = employee.calculatePay();
		assertTrue(money.payment == 10000);
	}

	@Test
	public void testHourlyEmployee() {
		record.type = 1;
		try {
			employee = factory.makeEmployee(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Money money = employee.calculatePay();
		assertTrue(money.payment == 6000);
	}

	@Test
	public void testSalaryEmployee() {
		record.type = 2;
		try {
			employee = factory.makeEmployee(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Money money = employee.calculatePay();
		assertTrue(money.payment == 5000);
	}

	@Test
	public void testCommissionedEmployeeByClassName() {
		record.employeeType = "com.wang.cleancode.switchcase.CommissionedEmployee";
		try {
			employee = factory.makeEmployeeByClassName(record.employeeType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Money money = employee.calculatePay();
		assertTrue(money.payment == 10000);

	}

	@Test
	public void testHourlyEmployeeByClassName() {
		record.employeeType = "com.wang.cleancode.switchcase.HourlyEmployee";
		try {
			employee = factory.makeEmployeeByClassName(record.employeeType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Money money = employee.calculatePay();
		assertTrue(money.payment == 6000);

	}


	@Test
	public void testSalaryEmployeeByClassName() {
		record.employeeType = "com.wang.cleancode.switchcase.SalaryEmployee";
		try {
			employee = factory.makeEmployeeByClassName(record.employeeType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Money money = employee.calculatePay();
		assertTrue(money.payment == 5000);

	}
}
