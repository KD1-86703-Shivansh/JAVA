package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		checkPalindrome obj = new checkPalindrome();
		obj.accept(sc);
		if(obj.check()) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}

}
