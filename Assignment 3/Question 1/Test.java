package com.sunbeam.p1;

public class Test {
	
	public static void main(String[] args) {
		
		Invoice i = new Invoice();
		i.accept();
		i.display();
		double total;
		total = i.totalPrice();
		
		System.out.println("Total : " + total);
	}
}
