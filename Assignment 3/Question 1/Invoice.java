package com.sunbeam.p1;

import java.util.Scanner;

public class Invoice {

	private String partNo;
	private String description;
	private int quantity;
	private double price;
	
	
	public Invoice() {
		this.partNo = "";
		this.description = "";
		this.quantity = 0;
		this.price = 0;
	}
	
	public Invoice(String partNo, String description, int quantity, double price, Scanner sc) {
		super();
		this.partNo = partNo;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.sc = sc;
	}


	public String getPartNo() {
		return partNo;
	}


	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter part number : ");
		partNo = sc.next();
		
		System.out.println("Description : ");
		description = sc.next();
		
		System.out.println("Enter Quantity : ");
		quantity = sc.nextInt();
		if(quantity<0) {
			setQuantity(0);
		}
		
		System.out.println("Enter Price : ");
		price = sc.nextInt();
		if(price<0) {
			setPrice(0.0);
		}
	}
	
	public void display() {
		System.out.println("Part Number - " + partNo);
		System.out.println("Part Description - " + description);
		System.out.println("Part Quantity - " + quantity);
		System.out.println("Price per item - " + price);
	}

	public double totalPrice()
	{
		double amount;
		amount = getPrice() * getQuantity();
		return amount;
	}

}
