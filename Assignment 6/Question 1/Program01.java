package com.sunbeam;

import com.sunbeam.exception.ExceptionLineTooLong;

public class Program01 {

	public Program01(String s) throws ExceptionLineTooLong {
		if(s.length()>80) {
			throw new ExceptionLineTooLong("String is greater than 80");
		}else {
			System.out.println("String is within the range..");
		}
	}
}