package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.Program01;
import com.sunbeam.exception.ExceptionLineTooLong;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String str = sc.next();
		
		try {
			Program01 p = new Program01(str);
		} catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}
		

	}

}
