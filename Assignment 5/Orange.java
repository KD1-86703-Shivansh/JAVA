package com.app.fruits;

public class Orange extends Fruit{
	

	public Orange(String color, String name, double weight) {
		super(color, name, weight, true);
	}

	@Override
	public String taste() {
		return "sweet";
	}

}
