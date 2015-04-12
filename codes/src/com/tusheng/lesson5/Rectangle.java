package com.tusheng.lesson5;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle: "+ length+"x"+width;
	}
}
