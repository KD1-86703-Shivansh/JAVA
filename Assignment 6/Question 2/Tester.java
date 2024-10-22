package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		reverseString obj = new reverseString();
		
		obj.accept(sc);
		System.out.println("Reverse String = "+ obj.reverse());

	}

}
