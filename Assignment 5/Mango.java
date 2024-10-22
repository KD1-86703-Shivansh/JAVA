package com.app.fruits;

public class Mango extends Fruit{
	
	public Mango() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Mango(String color, String name, double weight) {
		super(color, name, weight, true);
	}

	@Override
	public String taste() {
		return "sour";
	}

}
