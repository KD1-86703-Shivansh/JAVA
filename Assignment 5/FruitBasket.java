package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	
	public static int menu(Scanner sc) {
		
		System.out.println("Enter your choice : ");
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display all fruits in the basket");
		System.out.println("5. Display name, color, weight, taste of all fresh fruits, in the basket.");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7. Mark a fruit as stale.");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter basket size :");
		int size = sc.nextInt();
		Fruit basket[] = new Fruit [size];
		int counter=0;
		int choice;
		
		while((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				if(counter < size) {
					System.out.println("Enter Mango name, weight, color:");
                    String name = sc.next();
                    double weight = sc.nextDouble();
                    String color = sc.next();
                    basket[counter++] = new Mango(name, color, weight);
				}else {
					System.out.println("Basket is full");
				}
				break;
			case 2:
				if (counter < size) {
                    System.out.println("Enter Orange name, weight, color:");
                    String name = sc.next();
                    double weight = sc.nextDouble();
                    String color = sc.next();
                    basket[counter++] = new Orange(name, color, weight);
                } else {
                    System.out.println("Basket is full!");
                }
				break;
			case 3:
				if (counter < size) {
                    System.out.println("Enter Apple name, weight, color:");
                    String name = sc.next();
                    double weight = sc.nextDouble();
                    String color = sc.next();
                    basket[counter++] = new Apple(name, color, weight);
                } else {
                    System.out.println("Basket is full!");
                }
				break;
			case 4:
				System.out.println("Fruits in the basket:");
                for (Fruit f : basket) {
                    if (f != null) {
                        System.out.println(f.getColor());
                    }
                }
				break;
			case 5:
				System.out.println("Fresh fruits in the basket:");
                for (Fruit f : basket) {
                    if (f != null && f.isFresh()) {
                        System.out.println(f + ", Taste: " + f.taste());
                    }
                }
				break;
			case 6:
				System.out.println("Stale fruits in the basket:");
                for (Fruit f : basket) {
                    if (f != null && !f.isFresh()) {
                        System.out.println(f.getName() + " Taste: " + f.taste());
                    }
                }
				break;
			case 7:
				System.out.println("Enter the index of the fruit to mark as stale:");
                int index = sc.nextInt();
                if (index >= 0 && index < size && basket[index] != null) {
                    basket[index].setFresh(false);
                    System.out.println("Marked " + basket[index].getName() + " as stale.");
                } else {
                    System.out.println("Invalid index!");
                }
				break;
			case 8:
				System.out.println("Marking all sour fruits as stale:");
                for (Fruit f : basket) {
                    if (f != null && f.taste().equals("sour")) {
                        f.setFresh(false);
                    }
                }
                System.out.println("All sour fruits marked as stale.");
				break;

			default:
				System.out.println("Wrong choice!!!");
				break;
			}
		}

	}

}
