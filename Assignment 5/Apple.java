package com.app.fruits;

public class Apple extends Fruit {


	public Apple(String color, String name, double weight) {
		super(color, name, weight, true);
	}

	@Override
	public String taste() {
		return "sweet n sour";
	}
}
