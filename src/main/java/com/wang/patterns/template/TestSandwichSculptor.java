package com.wang.patterns.template;

public class TestSandwichSculptor {
	
	public static void main(String[] args){
		
		ItalianHoagie cust12Hoagie = new ItalianHoagie();
		
		cust12Hoagie.makeSandwich();
		
		System.out.println();
		
		VeggieHoagie cust13Hoagie = new VeggieHoagie();
		
		cust13Hoagie.makeSandwich();
		
	}
	
}