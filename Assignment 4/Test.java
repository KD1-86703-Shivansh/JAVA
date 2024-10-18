package com.app.geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1 = new Point2D(1, 2);
		Point2D p2 = new Point2D(1, 2);
		Point2D p3 = new Point2D(4, 6);
		
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
		System.out.println(p3.getDetails());
		
		System.out.println("isEqual : "+p1.isEqual(p2));
		if(p1.isEqual(p3))
		{
			System.out.println("p1 & p2 are located at the same position...");
		}
		else
		{
	        System.out.println("Both points are located at different positions.");
	        System.out.println("Distance bewteen the two points = " + p1.calculateDistance(p3));
	    }
//		System.out.println("Distance : "+p1.calculateDistance(p3));

	}

}
