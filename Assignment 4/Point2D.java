package com.app.geometry;

public class Point2D {
	
	private int xaxis;
	private int yaxis;
	
	
	public Point2D(int xaxis, int yaxis) {
		this.xaxis = xaxis;
		this.yaxis = yaxis;
	}
	
	public String getDetails() {
		return "("+xaxis+" , "+yaxis+")";
	}
	
	public boolean isEqual(Point2D b) {
		return this.xaxis == b.xaxis && this.yaxis == b.yaxis;
	}
	
	public double calculateDistance(Point2D b) {
		double distance = Math.sqrt (
				( Math.pow((this.xaxis - b.xaxis),2)) +
				( Math.pow((this.yaxis - b.yaxis),2)));
		return distance;
	}
	
}
