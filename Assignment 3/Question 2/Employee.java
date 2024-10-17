package com.sunbeam.p1;

import java.util.Scanner;

import javax.management.monitor.Monitor;

public class Employee {
	
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	
	public Employee() {
		firstName = "";
		lastName = "";
		monthlySalary = 0.0;
	}
	
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getMonthlySalary() {
		return monthlySalary;
	}


	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void accept(){
		
		System.out.println("Enter first name : ");
		firstName = sc.next();
		
		System.out.println("Enter last name : ");
		lastName = sc.next();
		
		System.out.println("Enter monthly salary : ");
		monthlySalary = sc.nextDouble();
		
		if(monthlySalary<0) {
			monthlySalary = 0.0;
		}
	}
	
	public void display() {
		System.out.println("First Name :" + firstName);
		System.out.println("Last Name :" + lastName);
		double yearlySalary = monthlySalary * 12;
		System.out.println("Yearly Salary :" + yearlySalary);
		double hikeSalary = yearlySalary + yearlySalary * 0.10;
		System.out.println("After Hike Salary :" + hikeSalary);
	}
	
	
	
}
