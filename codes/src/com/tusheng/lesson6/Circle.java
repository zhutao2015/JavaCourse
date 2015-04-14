package com.tusheng.lesson6;

public class Circle{
	public double calculateArea(int radius){
		return 3.14 * radius * radius;
	}
	
	
	public static void main(String argv[]){
		Circle c = new Circle();
		int r = 20;
		System.out.printf("Area of Circle(%d) is %.2f", r, c.calculateArea(r));
//		System.out.print("Area of Circle(" + r + ") is " + c.calculateArea(r));
	}
}