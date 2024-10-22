package com.sunbeam;

import java.util.Scanner;

public class checkPalindrome {
	String s;

	public checkPalindrome() {
		super();
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter string");
		s=sc.next();
	}
	
	public boolean check() {
		String temp = "";
		for(int i=s.length()-1;i>=0;i--) {
			temp = temp + s.charAt(i);
		}
		if(s.equals(temp)) return true;
		else return false;
	}
	
}
