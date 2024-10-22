package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {
	
	public String color;
	public String name;
	public double weight;
	public boolean isFresh;
	
	
	public Fruit() {} // default parameterless ctor


	// Parameterized ctor
	public Fruit(String color, String name, double weight, boolean isFresh) {
		this.color = color;
		this.name = name;
		this.weight = weight;
		this.isFresh = isFresh;
	}
	
	
	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public boolean isFresh() {
		return isFresh;
	}


	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public abstract String taste();
	
	@Override
	public String toString() {
		return "State of fruit : "+name+","+color+","+weight;
	}
	

	
	public void accept(Scanner sc) {
		System.out.println("Enter color of the fruit");
		color = sc.next();
		System.out.println("Enter name of the fruit");
		name = sc.next();
		System.out.println("Enter weight of the fruit");
		weight = sc.nextDouble();
	}
	
}
