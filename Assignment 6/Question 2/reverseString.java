package com.sunbeam;

import java.util.Scanner;

public class reverseString {
	
	String s;
	
	public reverseString() {
		// TODO Auto-generated constructor stub
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter string");
		s=sc.next();
	}
	
	public String reverse() {
		String temp = "";
		for(int i=s.length()-1;i>=0;i--) {
			temp = temp + s.charAt(i);
		}
		return temp;
	}

}
